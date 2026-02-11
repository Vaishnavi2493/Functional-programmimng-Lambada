package com.Lambada2;

import java.util.ArrayList;

public class Main1
{
	
	public static void main(String args[])
	{
		Test1 t=()->
		{
			ArrayList<User> users=new ArrayList<User>();
			
			User u1=new User(1,56537.8,22,"Tester");
			User u2=new User(2,676898.2,23,"HR");
			User u3=new User(3,145446.4,24,"Manager");
			
			users.add(u1);
			users.add(u2);
			users.add(u3);
			
			return users;
		};
		
		ArrayList<User> users=t.getUser();
		
		for(User user:users)
		{
			System.out.println(user.getId());
			System.out.println(user.getSalary());
			System.out.println(user.getAge());
			System.out.println(user.getDept());
			
			System.out.println("-------------------------------");
		}
	}

}
