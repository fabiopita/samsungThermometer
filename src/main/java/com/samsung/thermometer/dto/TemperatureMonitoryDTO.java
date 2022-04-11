package com.samsung.thermometer.dto;

import com.samsung.thermometer.enums.ThermometerType;

public class TemperatureMonitoryDTO {

	private Long idTemperatureMonitory;
    
    private ThermometerType type;
    
    private Double temperatureMonitory;

    private Double temperatureMonitoryRangeFrom;
    
    private Double temperatureMonitoryRangeTo;

	public Long getIdTemperatureMonitory() {
		return idTemperatureMonitory;
	}

	public void setIdTemperatureMonitory(Long idTemperatureMonitory) {
		this.idTemperatureMonitory = idTemperatureMonitory;
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
