package com.insurance.vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.vehicle.entity.TwoWheeler;

public interface TwoWheelerRepository extends JpaRepository<TwoWheeler,Long> {

}

