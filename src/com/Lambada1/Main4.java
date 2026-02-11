package com.Lambada1;

public class Main4
{
	public static void main(String args[])
	{
		Test4 t=(String names[])->
		{
			
		for(String name:names)
		{
			if(name.toLowerCase().startsWith("s"))
			{
				return name;
			}
			
		}
		
		return "There Is No Name start with s";
			
		};
		
		
		String name=t.getNames(new String[] {"Charan","Dhruu","Rudra","Ravi","Swamini"});
		System.out.println(name);
	}
	
}
