package com.insurance.vehicle.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.vehicle.entity.FourWheeler;
import com.insurance.vehicle.repository.FourWheelerRepository;

@Service
public class FourWheelerService {
	@Autowired
	public FourWheelerRepository fourwheelerRepository;

	public FourWheeler createFourWheeler(FourWheeler fourwheeler) {
		// TODO Auto-generated method stub
		return fourwheelerRepository.save(fourwheeler);
	}

	public Optional<FourWheeler> getFourWheelerByid(Long id) {
		// TODO Auto-generated method stub
		return fourwheelerRepository.findById(id);
	}

	public FourWheeler updateFourWheeler(Long id, FourWheeler fourwheeler) {
		Optional<FourWheeler> dbFourWheeler=fourwheelerRepository.findById(id);
		FourWheeler dbOpFourWheeler=dbFourWheeler.get();	
		
		
		if(fourwheeler.getFourName()!=null)
			dbOpFourWheeler.setFourName(fourwheeler.getFourName());
		
		if(fourwheeler.getFourCompany()!=null)
			dbOpFourWheeler.setFourCompany(fourwheeler.getFourCompany());
		
		if(fourwheeler.getFourVehicleNo()!=null)
			dbOpFourWheeler.setFourVehicleNo(fourwheeler.getFourVehicleNo());
		
		return fourwheelerRepository.save(dbOpFourWheeler);
	}

	public String deleteFourWheeler(Long id) {
		fourwheelerRepository.deleteById(id);
		return "One Four Wheeler Deleted Succesfully";
	}

}

