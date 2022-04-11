package com.samsung.thermometer.model;

import com.samsung.thermometer.enums.ThermometerType;

public class ThermometerCelsius extends Thermometer {
	
	public ThermometerCelsius() {
		super(0.0, 100.0, ThermometerType.CELSIUS);
	}

	public ThermometerCelsius(Double freezingTemp, Double boilingTemp, ThermometerType type) {
		super(freezingTemp, boilingTemp, type);
	}

}
