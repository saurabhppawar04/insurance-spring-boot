package com.insurance.vehicle.entity;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Policy")
public class Policy {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@JsonFormat(pattern = "yyyy/MM/dd")
    private Date startDate;
	@JsonFormat(pattern = "yyyy/MM/dd")
	private Date endDate;
	
	private Double amount;
	private Double policyNo;
	private String vehicleType;
	
	
	
	public Policy() {
		super();
	}
	
	
	public Policy(Long id, Date startDate, Date endDate, Double amount, Double policyNo, String vehicleType) {
		super();
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.amount = amount;
		this.policyNo = policyNo;
		this.vehicleType = vehicleType;
	}


	public long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Double getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(Double policyNo) {
		this.policyNo = policyNo;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
}
