package com.insurance.vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.vehicle.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long>{

}
