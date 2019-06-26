package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.domain.Rebel;
import com.example.demo.repositories.RebelRepository;

import exceptionhandling.ResourceNotFoundException;

@Service
public class RebelServiceImpl implements RebelService{

	private final RebelRepository rebelRepository;
	
	public RebelServiceImpl(RebelRepository rebelRepository) {
		this.rebelRepository = rebelRepository;
	}
	@Override
	public Rebel findRebelByID(long id) throws ResourceNotFoundException  {
		
		//log4j.info (------ INIT findRebelByID -------);
		// TODO Auto-generated method stub
		Rebel rebel = null;
		
		try {
			rebel = rebelRepository.findById(id).get();
		} catch (Exception e) {
			
			// log4j.error("mensaje error) TODO Auto-generated catch block
			System.out.println("catch from impl");
			//
			//throw new ResourceNotFoundException("mensajessss");
			// e.printStackTrace();
		}
		
		return rebel;
		//if(rebelRepository.findById(id).get() == null) {
			//log
			
		//}
		//log4j.info (------ END findRebelByID -------);
		//return rebelRepository.findById(id).get();
	}

	@Override
	public List<Rebel> findAllRebels() { 
		// TODO Auto-generated method stub
		return rebelRepository.findAll();
	}
	@Override
	public Rebel saveRebel(Rebel rebel) {
		// TODO Auto-generated method stub
		return rebelRepository.save(rebel);
	} 
}
