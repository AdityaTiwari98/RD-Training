package com.epam.fundamentals.cleanCode.temperatureConverter.factory;

import com.epam.fundamentals.cleanCode.temperatureConverter.api.TemperatureConverter;
import com.epam.fundamentals.cleanCode.temperatureConverter.service.CelciusToFarenhiteImpl;
import com.epam.fundamentals.cleanCode.temperatureConverter.service.FarenhiteToCelciusImpl;

public class TemperatureFactory {
	
	private TemperatureFactory() {
		
	}
	
	public static TemperatureConverter getInstance(String type)
	{
		if(type.equalsIgnoreCase("celciusToFarenhite"))
			return new CelciusToFarenhiteImpl();
		else
			return new FarenhiteToCelciusImpl();			
			
	}

}
