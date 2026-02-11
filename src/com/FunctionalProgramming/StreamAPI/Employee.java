package com.FunctionalProgramming.StreamAPI;

public class Employee
{
	private int id;
	private String name;
	private String address;
	private String gender;
	private String city;
	private double salary;
	private int age;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", gender=" + gender + ", city="
				+ city + ", salary=" + salary + ", age=" + age + "]";
	}
	public Employee(int id, String name, String address, String gender, String city, double salary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.city = city;
		this.salary = salary;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
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

}
