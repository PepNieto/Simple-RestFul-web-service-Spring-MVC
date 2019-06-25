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
		c1.setRebelFullName("Michael");
		c1.setPlanet("Weston");
		rebelRepository.save(c1);
		System.out.println(c1.toString());
		System.out.println("**************************************");
		Rebel c2 = new Rebel();
		c2.setRebelFullName("Sam");
		c2.setPlanet("Axe");
		rebelRepository.save(c2);
	
		Rebel c3 = new Rebel();
		c3.setRebelFullName("Fiona");
		c3.setPlanet("Shrek");
		rebelRepository.save(c3);
		
		System.out.println("Rebel Saved " + rebelRepository.count());
	}
}
