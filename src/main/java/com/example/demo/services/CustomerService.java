package com.example.demo.services;

import java.util.List;

import com.example.demo.domain.Customer;

public interface CustomerService {

	Customer findCustomerByID(long id);
	
	List<Customer> findAllCustomers();

	Customer saveCustomer(Customer customer);

}
