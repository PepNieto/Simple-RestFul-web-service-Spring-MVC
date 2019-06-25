package com.example.demo.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.domain.Rebel;
import com.example.demo.repositories.RebelRepository;

@Component
public class BootStrapData implements CommandLineRunner{

	private final RebelRepository rebelRepository;
	
	public BootStrapData(RebelRepository rebelRepository) {
		this.rebelRepository  = rebelRepository;
	}
	@Override
	public void run(String... args) throws Exception{
		
		System.out.println("Loading Customer Data");
		Rebel c1 = new Rebel();
		c1.setFirstname("Michael");
		c1.setLastname("Weston");
		rebelRepository.save(c1);
		
		Rebel c2 = new Rebel();
		c2.setFirstname("Sam");
		c2.setLastname("Axe");
		rebelRepository.save(c2);
	
		Rebel c3 = new Rebel();
		c3.setFirstname("Fiona");
		c3.setLastname("Shrek");
		rebelRepository.save(c3);
		
		System.out.println("Rebel Saved " + rebelRepository.count());
	}
}
