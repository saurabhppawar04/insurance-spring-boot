package com.insurance.vehicle.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TwoWheeler")
public class TwoWheeler {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String twoName;
	private String twoCompany;
	private String twoVehicleNo;
	
	
	public TwoWheeler() {
		super();
	}
	
	
	public TwoWheeler(Long id, String twoName, String twoCompany, String twoVehicleNo) {
		super();
		this.id = id;
		this.twoName = twoName;
		this.twoCompany = twoCompany;
		this.twoVehicleNo = twoVehicleNo;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTwoName() {
		return twoName;
	}
	public void setTwoName(String twoName) {
		this.twoName = twoName;
	}
	public String getTwoCompany() {
		return twoCompany;
	}
	public void setTwoCompany(String twoCompany) {
		this.twoCompany = twoCompany;
	}
	public String getTwoVehicleNo() {
		return twoVehicleNo;
	}
	public void setTwoVehicleNo(String twoVehicleNo) {
		this.twoVehicleNo = twoVehicleNo;
	}
}
