package com.example.demo.bootstrap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.domain.Rebel;
import com.example.demo.repositories.RebelRepository;

@Component
public class BootStrapData implements CommandLineRunner{
	private static final Logger logger = LogManager.getLogger(BootStrapData.class.getName());
	private final RebelRepository rebelRepository;
	
	public BootStrapData(RebelRepository rebelRepository) {
		this.rebelRepository  = rebelRepository;
	}
	@Override
	public void run(String... args) throws Exception{
		
		logger.info("*****  Starting APi REST OF REBELS   *******");
		

		System.out.println("Loading Customer Data");
		Rebel c1 = new Rebel();
		c1.setRebelFullName("Han Solo");
		c1.setPlanet("Mustafar");
		rebelRepository.save(c1);
		System.out.println(c1.toString());
		System.out.println("**************************************");
		Rebel c2 = new Rebel();
		c2.setRebelFullName("Ashoka");
		c2.setPlanet("Coruscant");
		rebelRepository.save(c2);
	
		Rebel c3 = new Rebel();
		c3.setRebelFullName("Spock");
		c3.setPlanet("Vulca");
		rebelRepository.save(c3);
		
		System.out.println("Rebel Saved " + rebelRepository.count());
		logger.info("*****  Loaded 3 Example Rebels  *******");
	}
}
