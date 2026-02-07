package com.Lambada1;

public class Main2
{
	public static void main(String args[])
	{
		Test2 t=(String name)->
		{
			return name.length();
		};
		
		System.out.println("Length Of Given String: " +t.getName("Vaishnavi"));
	}

}
