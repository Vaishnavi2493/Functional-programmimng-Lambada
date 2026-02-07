package com.Lambada1;

public class Main 
{
	
	public static void main(String args[])
	{
		Test t=(int num)->
		{
			if(num%2==0)
			{
			return true;
			}
			else
			{
			return false;
			}
		};
		
		boolean result=t.check(68);
		System.out.println(result);
	}

}
