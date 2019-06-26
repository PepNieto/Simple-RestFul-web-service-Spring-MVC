package com.example.demo.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.demo.domain.Rebel;

public interface RebelService {

	Rebel findRebelByID(long id) throws Exception;
	
	List<Rebel> findAllRebels();


	Rebel saveRebel(Rebel rebel);

}
