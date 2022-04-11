package com.samsung.thermometer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.samsung.thermometer.enums.ThermometerType;

@Entity
public class TemperatureMonitoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    
    private ThermometerType type;
    
    private Double temperatureMonitory;

    private Double temperatureMonitoryRangeFrom;
    
    private Double temperatureMonitoryRangeTo;
    
    
    
	public TemperatureMonitoryEntity() {
	}

	public TemperatureMonitoryEntity(ThermometerType type, Double temperatureMonitory,
			Double temperatureMonitoryRangeFrom, Double temperatureMonitoryRangeTo) {
		this.type = type;
		this.temperatureMonitory = temperatureMonitory;
		this.temperatureMonitoryRangeFrom = temperatureMonitoryRangeFrom==null ? 0.0 : temperatureMonitoryRangeFrom;
		this.temperatureMonitoryRangeTo = temperatureMonitoryRangeTo==null ? 0.0 : temperatureMonitoryRangeTo;
	}

	public Long getIdTemperatureMonitory() {
		return id;
	}

	public void setIdTemperatureMonitory(Long idTemperatureMonitory) {
		this.id = idTemperatureMonitory;
	}

	public ThermometerType getType() {
		return type;
	}

	public void setType(ThermometerType type) {
		this.type = type;
	}

	public Double getTemperatureMonitory() {
		return temperatureMonitory;
	}

	public void setTemperatureMonitory(Double temperatureMonitory) {
		this.temperatureMonitory = temperatureMonitory;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getTemperatureMonitoryRangeFrom() {
		return temperatureMonitoryRangeFrom;
	}

	public void setTemperatureMonitoryRangeFrom(Double temperatureMonitoryRangeFrom) {
		this.temperatureMonitoryRangeFrom = temperatureMonitoryRangeFrom;
	}

	public Double getTemperatureMonitoryRangeTo() {
		return temperatureMonitoryRangeTo;
	}

	public void setTemperatureMonitoryRangeTo(Double temperatureMonitoryRangeTo) {
		this.temperatureMonitoryRangeTo = temperatureMonitoryRangeTo;
	}

}
