package com.pkg;

import java.util.ArrayList;
import java.util.function.Consumer;



public class ConsumerDemo 
{
	public static void main(String args[])
	{
//		Consumer<Integer> c1=(Integer i)->
//		{
//			System.out.println(i);
//		};
//		
//		c1.accept(100);
		//////////////////
//		Consumer<String> c1=(s)->
//		{
//		System.out.println("Heyy " +s);	
//		};
//		c1.accept("Smahi");
//		c1.accept("Mudra");
//		c1.accept("Shital");
		/////////////////////       
//		Consumer<int[]> c1=(i)->
//		{
//		for(int x:i)
//		{
//			System.out.println(x);
//		}
//		};
//		c1.accept(new int[] {11,22,33,44,55,66});
		///////////////////////
		
//		Consumer<String[]> c1=(j)->
//		{
//			for(String x:j)
//			{
//				System.out.println(x);
//			}
//		};
		
//		c1.accept(new String[] {"Ram","Shyam","Hari","Tushh","Omii"});
		//////////////////////////
		
//		Consumer<Student> c1=(i)->
//		{
//		System.out.println(i);	
//		};
//		
//		Student s1=new Student(1,"Vishal","Pune");
//		Student s2=new Student(2,"Hari","Mumbai");
//		Student s3=new Student(3,"Nikhil","Nashik");
//		
//		c1.accept(s1);
//		c1.accept(s2);
//		c1.accept(s3);
		
		///////////////////////////////
		
//		Consumer<Student[]> c1=(student)->
//		{
//			for(Student s:student)
//			{
//		    System.out.println(s);	
//			}
//		};
//		
//		Student[] arr = {
//	            new Student(1, "Vishal", "Pune"),
//	            new Student(2, "Hari", "Mumbai"),
//	            new Student(3, "Nikhil", "Nashik")
//	        };
//		
//		c1.accept(arr);
		
		//////////////////////////////////
		
//		Consumer<ArrayList<Student>> c1=(students)->
//		{
//			for(Student s:students)
//			{
//			System.out.println(s.getId());	
//			System.out.println(s.getName());	
//			System.out.println(s.getAddress());	
//			System.out.println("--------------------------");
//			}
//		};
//		
//		ArrayList<Student> al=new ArrayList<Student>();
//		al.add(new Student(1,"Anvi","Satara"));
//		al.add(new Student(2,"Hari","Mumbai"));
//		al.add(new Student(3,"Akshada","Pune"));
//		
//		c1.accept(al);
		///////////////////////////////
//		Consumer<ArrayList<Employee>> c=(employees)->
//		{
//		for(Employee e:employees)
//		{
//			System.out.println(e.getId());
//			System.out.println(e.getName());
//			System.out.println(e.getSalary());
//		}
//		};
//		
//		ArrayList<Employee> al=new ArrayList<Employee>();
//		
//		al.add(new Employee(1,"Ganesh",563547.21));
//		al.add(new Employee(2,"Smita",65987.00));
//		al.add(new Employee(3,"Komal",1000000.00));
//		
//		c.accept(al);
		////////////////////////////////////////
		Consumer<ArrayList<Book>> c1=(books)->
		{
			for(Book b:books)
			{
				System.out.println(b.getId());
				System.out.println(b.getName());
				System.out.println(b.getPrice());
				System.out.println("------------------------------");
			}
		};
		
		ArrayList<Book> al=new ArrayList<Book>();
		al.add(new Book(1,"Wings Of Fire",678.0));
		al.add(new Book(2,"Man Me Hai Vishwas",700.0));
		al.add(new Book(3,"Shyamchi Aai",250.0));
		al.add(new Book(4,"Murutunjay",300.0));
		
	c1.accept(al);
		///////////////////////////////////////
		
	}

}
