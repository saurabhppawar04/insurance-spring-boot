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

import com.insurance.vehicle.entity.TwoWheeler;
import com.insurance.vehicle.service.TwoWheelerService;

@RestController
public class TwoWheelerController {
	@Autowired
	public TwoWheelerService tworwheelerservice;
	
	@PostMapping("/twowheeler")
	public TwoWheeler createCustomer(@RequestBody TwoWheeler twowheeler) {
		return tworwheelerservice.createTwoWheeler(twowheeler);
	}
	
	@GetMapping("/twowheeler/{id}")
	public Optional<TwoWheeler>findCustomerByid(@PathVariable Long id){
		return tworwheelerservice.getTwoWheelerByid(id);
	}
	
	@PutMapping("/twowheeler")
	public TwoWheeler updateCustomer(@PathVariable Long id, @RequestBody TwoWheeler twowheeler) {
		return tworwheelerservice.updateTwoWheeler(id, twowheeler);
	}
	
	@DeleteMapping("/twowheeler/{id}")
	public String deleteCustomer(@PathVariable Long id) {
		return tworwheelerservice.deleteTwoWheeler(id);
	}
}
