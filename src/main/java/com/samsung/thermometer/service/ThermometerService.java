package com.samsung.thermometer.service;

import com.samsung.thermometer.dto.TemperatureMonitoryDTO;
import com.samsung.thermometer.enums.ThermometerType;

public interface ThermometerService {
	public Double getTemperature(ThermometerType type);
	public Long postTemperatureMonitory(TemperatureMonitoryDTO dto);
	public Double getTemperatureMonitory(Long idTemperatureMonitory);
	public Double monitorTemperature(Long idTemperatureMonitory);

}
