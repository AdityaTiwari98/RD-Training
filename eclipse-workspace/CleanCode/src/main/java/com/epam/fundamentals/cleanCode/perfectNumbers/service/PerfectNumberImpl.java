package com.epam.fundamentals.cleanCode.perfectNumbers.service;

import com.epam.fundamentals.cleanCode.perfectNumbers.api.PerfectNumbers;

public class PerfectNumberImpl implements PerfectNumbers{
	
	public boolean isPerfectNumber (long number)
	{
		long sum=0;
		for(long i=1;i<=number/2;i++)
		{
			if(number%i==0)
				sum+=i;
		}
		return(sum==number);
	}

}
