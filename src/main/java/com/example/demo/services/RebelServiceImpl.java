package com.example.demo.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.bootstrap.BootStrapData;
import com.example.demo.domain.Rebel;
import com.example.demo.repositories.RebelRepository;

import exceptionhandling.ResourceNotFoundException;

@Service
public class RebelServiceImpl implements RebelService{
	private static final Logger logger = LogManager.getLogger(BootStrapData.class.getName());
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
			logger.info("Client used findRebelById Successfully");
			rebel = rebelRepository.findById(id).get();
		} catch (Exception e) {
			
			logger.error("While using findRebelById");
			System.out.println("catch from impl");
			// e.printStackTrace();
		}
		
		
		logger.info("*****  END findRebelByID   *******");
		return rebel;		
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
