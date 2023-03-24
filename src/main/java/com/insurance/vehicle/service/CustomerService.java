package com.insurance.vehicle.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.vehicle.entity.Customer;
import com.insurance.vehicle.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	public CustomerRepository customerRepository;

	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	public Optional<Customer> getCustomerByid(Long id) {
		// TODO Auto-generated method stub
		return customerRepository.findById(id);
	}

	public Customer updateCustomer(Long id, Customer customer) {
		Optional<Customer> dbCustomer=customerRepository.findById(id);
		Customer dbOpCustomer=dbCustomer.get();	
		
		
		if(customer.getName()!=null)
			dbOpCustomer.setName(customer.getName());
		
		if(customer.getContact()!=null)
			dbOpCustomer.setContact(customer.getContact());
		
		if(customer.getAddress()!=null)
			dbOpCustomer.setAddress(customer.getAddress());
		
		if(customer.getEmail()!=null)
			dbOpCustomer.setEmail(customer.getEmail());
		
		return customerRepository.save(dbOpCustomer);
	}

	public String deleteCustomer(Long id) {
		customerRepository.deleteById(id);
		return "One Customer Deleted Succesfully";
	}
}