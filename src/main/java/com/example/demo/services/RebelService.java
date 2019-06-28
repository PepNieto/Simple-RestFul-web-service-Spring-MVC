package com.example.demo.services;

import java.util.List;

import com.example.demo.domain.Rebel;

public interface RebelService {

	Rebel findRebelByID(long id) throws Exception;
	
	List<Rebel> getAllRebels() throws Exception;


	Rebel saveRebel(Rebel rebel) throws Exception;

}
