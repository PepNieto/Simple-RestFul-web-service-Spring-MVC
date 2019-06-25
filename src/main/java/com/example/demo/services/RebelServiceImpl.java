package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.domain.Rebel;
import com.example.demo.repositories.RebelRepository;

@Service
public class RebelServiceImpl implements RebelService{

	private final RebelRepository rebelRepository;
	
	public RebelServiceImpl(RebelRepository rebelRepository) {
		this.rebelRepository = rebelRepository;
	}
	@Override
	public Rebel findRebelByID(long id) {
		// TODO Auto-generated method stub
		return rebelRepository.findById(id).get();
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
