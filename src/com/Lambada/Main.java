package com.Lambada;

public class Main 
{
	public static void main(String args[])
	{
		///With Passing Array///
		Test t=(int arr[])->
		{
		for(int x:arr)
		{
			System.out.println(x);
		}
		};
		int num[]= {1,2,3,4,5,6,};
		t.fun(num);
		
		Test t1=(int arr[])->
		{
		for(int s:arr)
		{
			System.out.println(s);
		}
		};
		
		int num1[]= {11,22,33,44,55,66,77,88,99};
		t1.fun(num1);
		
		
		///With String Return Type///
		
//		Test t=(name)->
//		{
//		return(name).toUpperCase();	
//		};
//		
//		System.out.println("Name: " +t.getName("Vaishnavi"));
//		
//		Test t1=(name)->
//		{
//			return (name);
//		};
//		System.out.println("Nick Name: " +t1.getName("Avanti"));
		
		///With int Return Type///
//		Test t=()->
//		{
//			return 100;
//		};
//		
//		int x=t.add();
//		System.out.println(x);
//		
//		
//		Test t1=()->
//		{
//			return 10+10;
//		};
//		
//		 x=t1.add();
//		System.out.println(x);
		///With Parameter///
//		Test t=(int a,int b)->
//		{
//			System.out.println("Addition: " +(a+b));
//			
//		};
//		
//		t.add(10, 40);
//		
//		Test t1=(int a,int b)->
//		{
//			System.out.println("Addition Of Two Numbers: " +(a+b));
//		};
//		
//		t1.add(678, 100);
	
		///Dafault Parameter///
//	Test t=()->
//	{
//     System.out.println("Add Method");
//	};
//	
//	t.add();
//	
//	
//	
//	Test t2=()->
//	{
//		System.out.println("I am Implementing a Lambada Function");
//	};
//	
//	t2.add();

}
}
