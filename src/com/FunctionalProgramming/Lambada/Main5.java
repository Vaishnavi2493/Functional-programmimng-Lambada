package com.FunctionalProgramming.Lambada;

public class Main5 
{
	public static void main(String args[])
	{
	
		Test5 t=(int num[])->
		{
			int min=num[0];
			
			for(int i:num)
			{
				if(i<min)
				{
					min=i;
				}
			}
			return min;
			
		};
		
		
		int min=t.Min(new int[] {6574,1423,8778,3434});
		System.out.println("Minimum Number Is: " +min);
	}

}
