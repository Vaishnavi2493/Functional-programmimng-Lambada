package com.Lambada1;

public class Main3 
{
	public static void main(String args[])
	{
		Test3 t=()->
		{
			return new String[] {"Vaishnavi","Omii","Vishal","Hari"};
		};
		
		String names[]=t.getNames();
		
		for(String s:names)
		{
			System.out.println(s);
		}
	}

}
