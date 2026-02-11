package com.FunctionalProgramming.StreamAPI;

import java.util.Arrays;

public class Demo 
{
	
	public static void main(String args[])
	{
		
		
		Book book=new Book(1,"Java Programming Basic",900.00,"Programming",10);
		Book book1=new Book(2,"Advanced Java 8",1650.0,"Programming",5);
		Book book2=new Book(3,"Data Sturucture In Java",1250,"Computer Science",8);
		Book book3=new Book(4,"Clean Code",1000,"Software Dev",12);
		Book book4=new Book(5,"Rich Dad Poor Dad",300,"Finance",20);
		
		Arrays.asList(book,book1,book2,book3,book4).stream().filter(b->b.getPrice()>=1000).map(b->b.getName() +" : " +b.getPrice()).forEach(i->System.out.println(i));
		
		
		
		
		
		
		
		
		
		////////////////////////////////////////////
//		Book book=new Book(1,"Java Programming Basic",900.00,"Programming",10);
//		Book book1=new Book(2,"Advanced Java 8",1650.0,"Programming",5);
//		Book book2=new Book(3,"Data Sturucture In Java",1250,"Computer Science",8);
//		Book book3=new Book(4,"Clean Code",1000,"Software Dev",12);
//		Book book4=new Book(5,"Rich Dad Poor Dad",300,"Finance",20);
//		
//		Arrays.asList(book,book1,book2,book3,book4).stream().map(b->b.getName()+ " : "+b.getPrice()).forEach(i->System.out.println(i));
		
		/////////////////////////////////////////////
//		Employee emp=new Employee(1,"Asmita","Pune","Female","Pune",565375,19);
//		Employee emp1=new Employee(2,"Gouri","karad","Female","karad",450000,19);
//		Employee emp2=new Employee(3,"Sanika","kolhapur","Female","kolhapur",56000,19);
//		Employee emp3=new Employee(4,"vedanti","kolhapur","Female","kolhapur",650000,19);
//		Employee emp4=new Employee(5,"Sakshi","satara","Female","satara",30000,19);
//		
//		Arrays.asList(emp,emp1,emp2,emp3,emp4).stream().filter(emp5->emp5.getSalary()>=50000).forEach(i->System.out.println(i));
	}

}
