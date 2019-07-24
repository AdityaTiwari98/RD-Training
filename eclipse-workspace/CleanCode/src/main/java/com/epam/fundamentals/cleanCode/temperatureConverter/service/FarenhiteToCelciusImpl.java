package com.epam.fundamentals.cleanCode.temperatureConverter.service;

import com.epam.fundamentals.cleanCode.temperatureConverter.api.TemperatureConverter;

public class FarenhiteToCelciusImpl implements TemperatureConverter {

	public double convert(double temperature) {
		return (temperature-32)*5/9;
	}

}
