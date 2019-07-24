package com.epam.fundamentals.cleanCode.fizzBuzz.service;

import com.epam.fundamentals.cleanCode.fizzBuzz.api.FizzBuzzSeries;

public class FizzBuzzImpl implements FizzBuzzSeries {

	public String generateSeries(long start,long end) {
		StringBuilder stringBuilder=new StringBuilder();
		for(long i=start;i<=end;i++)
		{
			if(i%15==0)
				stringBuilder.append("FizzBuzz ");
			else if(i%3==0)
				stringBuilder.append("Fizz ");
			else if(i%5==0)
				stringBuilder.append("Buzz ");
			else
				stringBuilder.append(i+" ");
		}
		return stringBuilder.toString();
	}

}
