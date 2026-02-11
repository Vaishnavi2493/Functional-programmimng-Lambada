package com.FunctionalProgramming.Lambada;

public class Main4 
{
	public static void main(String args[])
	{
		Test4 t=(int num[])->
		{
		int max=num[0];
		for(int i:num)
		{
			if(i>max)
			{
				max=i;
			}
		}
		 return max;	
		};
		
		int numbers[]= {6743,3547,1234,4768,2356,1423};
		int maxNum=t.max(numbers);
		System.out.println(maxNum);
	}

}
