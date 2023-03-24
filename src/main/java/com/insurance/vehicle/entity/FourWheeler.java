package com.insurance.vehicle.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="FourWheeler")
public class FourWheeler {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String fourName;
	private String fourCompany;
	private String fourVehicleNo;
	
	
	public FourWheeler() {
		super();
	}
	
	
	public FourWheeler(Long id, String fourName, String fourCompany, String fourVehicleNo) {
		super();
		this.id = id;
		this.fourName = fourName;
		this.fourCompany = fourCompany;
		this.fourVehicleNo = fourVehicleNo;
	}


	public long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFourName() {
		return fourName;
	}
	public void setFourName(String fourName) {
		this.fourName = fourName;
	}
	public String getFourCompany() {
		return fourCompany;
	}
	public void setFourCompany(String fourCompany) {
		this.fourCompany = fourCompany;
	}
	public String getFourVehicleNo() {
		return fourVehicleNo;
	}
	public void setFourVehicleNo(String fourVehicleNo) {
		this.fourVehicleNo = fourVehicleNo;
	}
	
	
}

