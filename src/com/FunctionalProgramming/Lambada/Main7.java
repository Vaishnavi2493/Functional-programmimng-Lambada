package com.FunctionalProgramming.Lambada;

public class Main7 
{
	public static void main(String args[])
	{
		Test7 t=(int num[])->
		{
			int sum=0;
			
			for(int i:num)
			{
				if(i%2!=0)
				{
				sum+=i;	
				}
			}
			
			return sum;
			
		};
		
		int numbers[]={11,22,33,44,55,66,77,88,99,100};
		int sum=t.sumOdd(numbers);
		System.out.println("Sum of Odd Numbers: " +sum);
	}

}
