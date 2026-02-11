package com.Lambada1;

import java.util.ArrayList;

public class Main6 
{
	
	public static void main(String args[])
	{
		
		Test6 t=()->
		{
		ArrayList<Student> students=new ArrayList<Student>();
		
		Student s1=new Student(1,"Swami","Satara");
		Student s2=new Student(2,"Shrja","Wai");
		Student s3=new Student(3,"Mudra","Rajgad");
		Student s4=new Student(4,"Dhruu","Mumbai");
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		
		
		return students;
		};
		
		ArrayList<Student> students=t.getStudent();
		
		for(Student student:students)
		{
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getAddress());
		System.out.println("------------------------------");
		
		}
		
		
		
		
	}

}
