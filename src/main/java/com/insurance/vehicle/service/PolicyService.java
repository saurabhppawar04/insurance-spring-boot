package com.insurance.vehicle.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.vehicle.entity.Policy;
import com.insurance.vehicle.repository.PolicyRepository;

@Service
public class PolicyService {

	@Autowired
	public PolicyRepository policyRepository;
	
	public Policy createPolicy(Policy policy) {
		// TODO Auto-generated method stub
		return policyRepository.save(policy);
	}

	public Optional<Policy> getPolicyByid(Long id) {
		// TODO Auto-generated method stub
		return policyRepository.findById(id);
	}

	public Policy updatePolicy(Long id, Policy policy) {
		Optional<Policy> dbPolicy=policyRepository.findById(id);
		Policy dbOpPolicy=dbPolicy.get();	
		
		
		if(policy.getStartDate()!=null)
			dbOpPolicy.setStartDate(policy.getStartDate());
		
		if(policy.getEndDate()!=null)
			dbOpPolicy.setEndDate(policy.getEndDate());
		
		if(policy.getAmount()!=null)
			dbOpPolicy.setAmount(policy.getAmount());
		
		if(policy.getPolicyNo()!=null)
			dbOpPolicy.setPolicyNo(policy.getPolicyNo());
		
		if(policy.getVehicleType()!=null)
			dbOpPolicy.setVehicleType(policy.getVehicleType());
		
		return policyRepository.save(dbOpPolicy);
	}

	public String deletePolicy(Long id) {
		policyRepository.deleteById(id);
		return "One Policy Deleted Succesfully";
	}

	
}
