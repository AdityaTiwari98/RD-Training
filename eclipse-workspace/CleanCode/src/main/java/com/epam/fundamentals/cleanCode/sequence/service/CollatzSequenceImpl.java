package com.epam.fundamentals.cleanCode.sequence.service;

import com.epam.fundamentals.cleanCode.sequence.api.Sequence;

public class CollatzSequenceImpl implements Sequence{
	
	public String generateSequence(long number)
	{
		StringBuilder stringBuilder=new StringBuilder();
		while(number!=1)
		{
			stringBuilder.append(number+" ");
			if(number%2==0)
				number=number/2;
			else
				number=3*number+1;
		}
		stringBuilder.append(1);
		return stringBuilder.toString();
	}

}
