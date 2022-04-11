package com.samsung.thermometer.model;

import com.samsung.thermometer.enums.ThermometerType;

public class ThermometerFactory {
	public static Thermometer getThermometer(ThermometerType type) {
		if (type == null) {
			return null;
		}
		if (type.equals(ThermometerType.CELSIUS)) {
			return new ThermometerCelsius();

		} else if (type.equals(ThermometerType.FAHRENHEIT)) {
			return new ThermometerFahrenheit();

		}
		return null;
	}
}
