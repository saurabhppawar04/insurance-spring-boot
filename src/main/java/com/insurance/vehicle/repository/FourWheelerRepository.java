package com.insurance.vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.vehicle.entity.FourWheeler;

public interface FourWheelerRepository extends JpaRepository<FourWheeler,Long> {

}

