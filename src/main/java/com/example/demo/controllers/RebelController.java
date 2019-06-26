 package com.example.demo.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Rebel;
import com.example.demo.services.RebelService;

@RestController 
@RequestMapping(RebelController.BASE_URL)
public class RebelController {

		public static final String BASE_URL = "/api/v1/rebels";
		private final RebelService rebelService;
		
		public RebelController(RebelService rebelService) {
			this.rebelService = rebelService;
		}
		
	@GetMapping
	List<Rebel> getAllRebels(){
		
		return  rebelService.findAllRebels();
		
	}
	@GetMapping("/{id}") 
	public ResponseEntity<?> getRebelById(@PathVariable String id) throws Exception {
	Long userID;
	
	try{
		 userID = Long.parseLong(id);
	}catch(Exception e){
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
	}
	if(userID < 0) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		
	}
	
	
	Rebel rebel = new Rebel();
		try {
			rebel = rebelService.findRebelByID(userID);
		} catch (Exception e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();	
			System.out.println("BAAAAAAAAAAADDDDDDD REQUEST ********");
			return new ResponseEntity<Rebel>(HttpStatus.BAD_REQUEST);
		}
	
		
		if(rebel == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return new ResponseEntity(rebel, HttpStatus.OK);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Rebel saveRebel(@RequestBody Rebel rebel) {
		System.out.println("True");
		return rebelService.saveRebel(rebel);
	}

}
