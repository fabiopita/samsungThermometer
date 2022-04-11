package com.samsung.thermometer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.samsung.thermometer.entity.TemperatureMonitoryEntity;

@Repository
public interface TemperatureMonitoryRepository extends JpaRepository<TemperatureMonitoryEntity, Long> {

}
