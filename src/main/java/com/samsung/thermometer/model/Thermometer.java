package com.samsung.thermometer.model;

import java.util.Random;

import com.samsung.thermometer.enums.ThermometerType;

public abstract class Thermometer {
	private Double freezingTemp;
	private Double boilingTemp;
	private ThermometerType type;
	private Random random;
	
	public Thermometer(Double freezingTemp, Double boilingTemp, ThermometerType type) {
		this.freezingTemp = freezingTemp;
		this.boilingTemp = boilingTemp;
		this.type = type;
		this.random = new Random();
	}

	public Double getFreezingTemp() {
		return freezingTemp;
	}

	public void setFreezingTemp(Double freezingTemp) {
		this.freezingTemp = freezingTemp;
	}

	public Double getBoilingTemp() {
		return boilingTemp;
	}

	public void setBoilingTemp(Double boilingTemp) {
		this.boilingTemp = boilingTemp;
	}

	public ThermometerType getType() {
		return type;
	}

	public void setType(ThermometerType type) {
		this.type = type;
	}

	public Double getTemperature() {
		return random.nextDouble(this.getFreezingTemp(), this.getBoilingTemp());
	}
/*
	public Integer postTemperatureMonitory(ThermometerType type, Double temperatureMonitory,
			Double temperatureMonitoryRange) {
		 
		return null;
	}

	public abstract Double getTemperatureMonitory(Integer idTemperatureMonitory);

	public abstract Double convertTemperature(Double temperature, ThermometerType typeFrom, ThermometerType typeTo);
*/
}
