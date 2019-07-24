package com.epam.fundamentals.cleanCode.temperatureConverter.service;

import com.epam.fundamentals.cleanCode.temperatureConverter.api.TemperatureConverter;

public class CelciusToFarenhiteImpl implements TemperatureConverter {

	public double convert(double temperature) {
		return (temperature*9/5)+32;
	}

}
