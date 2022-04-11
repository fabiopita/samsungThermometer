package com.samsung.thermometer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.samsung.thermometer.entity.TemperatureEntity;

@Repository
public interface TemperatureRepository extends JpaRepository<TemperatureEntity, Long> {

}
