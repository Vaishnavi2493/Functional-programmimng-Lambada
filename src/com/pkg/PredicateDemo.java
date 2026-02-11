package com.pkg;

import java.util.function.Predicate;

public class PredicateDemo 
{
	public static void main(String args[])
	{
//		Predicate<Integer> p1=(i)->
//		{
//			return true;
//		};
//		
//		System.out.println(p1.test(100));
		///////////////////////////////////
//		Predicate<Integer> p=(i)->
//		{
//			return i>100;
//		};
//		
//		System.out.println(p.test(45));
		//////////////////////////////////
//		Predicate<Integer> p=(i)->
//		{
//			if(i%2==0)
//			{
//				return true;
//			}
//			else
//			{
//				return false;
//			}
//		};
//		
//		if(p.test(88))
//		{
//			System.out.println("Even Number");
//		}
//		else
//		{
//			System.out.println("Odd Number");
//		}
		///////////////////////////////////////
		Predicate<String> p=(name)->
		{
		return name.startsWith(name);	
		};
		
		boolean b=p.test("vaishnavisakunde");
		System.out.println(b);
	}

}
