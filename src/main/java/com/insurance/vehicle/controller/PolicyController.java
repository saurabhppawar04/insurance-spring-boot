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

import com.insurance.vehicle.entity.Policy;
import com.insurance.vehicle.service.PolicyService;

@RestController
public class PolicyController {
	@Autowired
	public PolicyService policyservice;
	
	@PostMapping("/policy")
	public Policy createPolicy(@RequestBody Policy policy) {
		return policyservice.createPolicy(policy);
	}
	
	@GetMapping("/policy/{id}")
	public Optional<Policy>findPolicyByid(@PathVariable Long id){
		return policyservice.getPolicyByid(id);
	}
	
	@PutMapping("/policy")
	public Policy updatePolicy(@PathVariable Long id, @RequestBody Policy policy) {
		return policyservice.updatePolicy(id, policy);
	}
	
	@DeleteMapping("/policy/{id}")
	public String deletePolicy(@PathVariable Long id) {
		return policyservice.deletePolicy(id);
	}
}
