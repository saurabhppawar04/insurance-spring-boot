package com.insurance.vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.vehicle.entity.Policy;


public interface PolicyRepository extends JpaRepository<Policy,Long>{

}
