package com.insurance.vehicle.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.vehicle.entity.Customer;
import com.insurance.vehicle.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	public CustomerService customerservice;
	
	@PostMapping("/customer")
	public Customer createCustomer(@RequestBody Customer customer) {
		return customerservice.createCustomer(customer);
	}
	
	@GetMapping("/customer/{id}")
	public Optional<Customer>findCustomerByid(@PathVariable Long id){
		return customerservice.getCustomerByid(id);
	}
	
	@PutMapping("/customer")
	public Customer updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {
		return customerservice.updateCustomer(id, customer);
	}
	
	@DeleteMapping("/customer/{id}")
	public String deleteCustomer(@PathVariable Long id) {
		return customerservice.deleteCustomer(id);
	}
}
