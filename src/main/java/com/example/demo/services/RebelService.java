package com.example.demo.services;

import java.util.List;

import com.example.demo.domain.Rebel;

public interface RebelService {

	Rebel findRebelByID(long id);
	
	List<Rebel> findAllRebels();


	Rebel saveRebel(Rebel rebel);

}
