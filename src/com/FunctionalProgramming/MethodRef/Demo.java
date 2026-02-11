package com.FunctionalProgramming.MethodRef;

public class Demo 
{
	public static void main(String args[])
	{
		Student s1=new Student();
		
		Test t=Student::m1;
		t.add(100);
		t.add(220);
//		Test t=s1::fun;
//		t.add();
//		
//		Test t1=Student::m1;
//		t1.add();
		
//		Test t2=Student::new;
//		t2.add();
		
		
	
	}
	
}
