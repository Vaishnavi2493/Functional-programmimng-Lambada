package com.FunctionalProgramming.Lambada;

public class Main6 
{
public static void main(String args[])
{
	Test6 t=(int num[])->
	{
		int sum=0;
		for(int i:num)
		{
			if(i%2==0)
			{
			sum+=i;	
			}
		}
		
		return sum;
	};
	
	int numbers[]=(new int[] {11,22,33,44,55,66,77,88,99});
	int sum=t.sumEven(numbers);
	System.out.println("Sum Of Even numbers: " +sum);
}
}
