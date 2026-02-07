package com.Lambada1;

public class Main1
{
	
	public static void main(String args[])
	{
		Test1 t=( a, b)->
		{
			System.out.println("Addition Of Two Numbers: " +(a+b));
		};
		
		t.add(100, 200);
	}

}
