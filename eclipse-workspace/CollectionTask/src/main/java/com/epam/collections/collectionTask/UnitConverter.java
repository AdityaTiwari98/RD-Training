package com.epam.collections.collectionTask;

public class UnitConverter {

	public static Unit getConverter(int type)
	{
		if(type==1)
			return new InchToFeet();
		else if(type==2)
			return new InchToMeter();
		else if(type==3)
			return new FeetToInch();
		else if(type==4)
			return new FeetToMeter();
		else if(type==5)
			return new MeterToInch();
		else
			return new MeterToFeet();
			
	}
}
