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

import com.insurance.vehicle.entity.FourWheeler;
import com.insurance.vehicle.service.FourWheelerService;

@RestController
public class FourWheelerController {
	@Autowired
	public FourWheelerService fourwheelerservice;
	
	@PostMapping("/fourwheeler")
	public FourWheeler createCustomer(@RequestBody FourWheeler fourwheeler) {
		return fourwheelerservice.createFourWheeler(fourwheeler);
	}
	
	@GetMapping("/fourwheeler/{id}")
	public Optional<FourWheeler>findCustomerByid(@PathVariable Long id){
		return fourwheelerservice.getFourWheelerByid(id);
	}
	
	@PutMapping("/fourwheeler")
	public FourWheeler updateCustomer(@PathVariable Long id, @RequestBody FourWheeler fourwheeler) {
		return fourwheelerservice.updateFourWheeler(id, fourwheeler);
	}
	
	@DeleteMapping("/fourwheeler/{id}")
	public String deleteCustomer(@PathVariable Long id) {
		return fourwheelerservice.deleteFourWheeler(id);
	}
}
