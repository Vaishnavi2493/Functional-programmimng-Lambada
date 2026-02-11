package com.Lambada2;

public class User
{
	private int id;
	
	private double salary;
	
	private int age;
	
	public User(int id, double salary, int age, String dept) {
		super();
		this.id = id;
		this.salary = salary;
		this.age = age;
		this.dept = dept;
	}

	private String dept;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	

}
