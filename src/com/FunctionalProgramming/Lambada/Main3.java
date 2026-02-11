package com.FunctionalProgramming.Lambada;

public class Main3
{
	public static void main(String args[])
	{
		
		Test3 t=(int num[])->
		{
		int  sum=0;
		for(int i:num)
		{		
		sum+=i;	
		}
		return sum;
		};
//		int numbers[]= {4,6,9,2,4,8};
		int sum=t.doSum(new int[] {4,6,9,2,4,8});
		System.out.println("Sum is: " +sum);
	}
	
	

}
