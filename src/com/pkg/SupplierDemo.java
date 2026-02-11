package com.pkg;

import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierDemo
{
	public static void main(String args[])
	{
//		Supplier<String> s=()->
//		{
//			return "Vishal";
//		};
//		
//		String name=s.get();
//		System.out.println(name);
		///////////////////////
//		Supplier<int[]> c=()->
//		{
//		int number[]= {11,22,33,44,55,66,77,88,99,100};
//		
//		return number;
//		};
//		
//		int[]nums=c.get();
//		for(int num:nums)
//		{
//			System.out.println(num);
//		}
		////////////////////////////
//		Supplier<ArrayList<Student>> s=()->
//		{
//			ArrayList<Student> al=new ArrayList<Student>();
//			al.add(new Student(1,"Anvi","Satara"));
//			al.add(new Student(2,"Hari","Mumbai"));
//			al.add(new Student(3,"Akshada","Pune"));
//			
//			return al;
//		};
//		
//		
//		ArrayList<Student> students=s.get();
//		for(Student student:students)
//		{
//			System.out.println(student.getId());
//			System.out.println(student.getName());
//			System.out.println(student.getAddress());
//			System.out.println("------------------------");
//		}
		///////////////////////////////////////////
		
		Supplier<ArrayList<Employee>> s=()->
		{
		ArrayList<Employee> al=new ArrayList<Employee>();
		{
			al.add(new Employee(1,"Anvi",767868.9));
			al.add(new Employee(2,"Hari",676574.4));
			al.add(new Employee(3,"Akshada",646357));
			
		return al;
		}
		};
		
		ArrayList<Employee> employee=s.get();
		for(Employee emp:employee)
		{
			System.out.println(emp.getId());
			System.out.println(emp.getName());
			System.out.println(emp.getSalary());
			System.out.println("------------------------");	
		}
	}

}
