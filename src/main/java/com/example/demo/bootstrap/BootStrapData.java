package com.example.demo.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.domain.Customer;
import com.example.demo.repositories.CustomerRepository;

@Component
public class BootStrapData implements CommandLineRunner{

	private final CustomerRepository customerRepository;
	
	public BootStrapData(CustomerRepository customerRepository) {
		this.customerRepository  = customerRepository;
	}
	@Override
	public void run(String... args) throws Exception{
		
		System.out.println("Loading Customer Data");
		System.out.println("Loaded Customer Data");
		Customer c1 = new Customer();
		c1.setFirstname("Michael");
		c1.setLastname("Weston");
		customerRepository.save(c1);
		
		Customer c2 = new Customer();
		c2.setFirstname("Sam");
		c2.setLastname("Axe");
		customerRepository.save(c2);
	
		Customer c3 = new Customer();
		c3.setFirstname("Fiona");
		c3.setLastname("Shrek");
		customerRepository.save(c3);
		
		System.out.println("Customer Saved " + customerRepository.count());
	}
}
