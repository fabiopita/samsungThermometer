package com.samsung.thermometer.model;

import com.samsung.thermometer.enums.ThermometerType;

public class ThermometerFahrenheit extends Thermometer {

	public ThermometerFahrenheit() {
		super(32.0, 212.0, ThermometerType.FAHRENHEIT);
	}

	public ThermometerFahrenheit(Double freezingTemp, Double boilingTemp, ThermometerType type) {
		super(freezingTemp, boilingTemp, type);
	}

}
