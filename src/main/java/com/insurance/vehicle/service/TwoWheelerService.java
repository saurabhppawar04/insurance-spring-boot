package com.insurance.vehicle.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.vehicle.entity.TwoWheeler;
import com.insurance.vehicle.repository.TwoWheelerRepository;

@Service
public class TwoWheelerService {
	@Autowired
	public TwoWheelerRepository twowheelerRepository;

	public TwoWheeler createTwoWheeler(TwoWheeler twowheeler) {
		// TODO Auto-generated method stub
		return twowheelerRepository.save(twowheeler);
	}

	public Optional<TwoWheeler> getTwoWheelerByid(Long id) {
		// TODO Auto-generated method stub
		return twowheelerRepository.findById(id);
	}

	public TwoWheeler updateTwoWheeler(Long id, TwoWheeler twowheeler) {
		Optional<TwoWheeler> dbTwoWheeler=twowheelerRepository.findById(id);
		TwoWheeler dbOpTwoWheeler=dbTwoWheeler.get();	
		
		
		if(twowheeler.getTwoName()!=null)
			dbOpTwoWheeler.setTwoName(twowheeler.getTwoName());
		
		if(twowheeler.getTwoCompany()!=null)
			dbOpTwoWheeler.setTwoCompany(twowheeler.getTwoCompany());
		
		if(twowheeler.getTwoVehicleNo()!=null)
			dbOpTwoWheeler.setTwoVehicleNo(twowheeler.getTwoVehicleNo());
		
		return twowheelerRepository.save(dbOpTwoWheeler);
	}

	public String deleteTwoWheeler(Long id) {
		twowheelerRepository.deleteById(id);
		return "One Two Wheeler Deleted Succesfully";
	}

}
