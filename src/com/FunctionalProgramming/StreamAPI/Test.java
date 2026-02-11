package com.FunctionalProgramming.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test
{
	
	public static void main(String args[])
	{
		
		User user=new User(1,"Sanika","sanika@gmail.com","Kolhapur");
		User user1=new User(2,"Vedanti","vedanti@gmail.com","Kolhapur");
		User user2=new User(3,"Asmita","asmii@gmail.com","Satara");
		User user3=new User(4,"Shreya","shreya@gmail.com","Akluj");
		User user4=new User(5,"Vaishnvai","vaishnvai@gmail.com","Lonavala");
		
		Arrays.asList(user,user1,user2,user3,user4).stream().map(user5->user5.getName()+ " : "+user5.getName().length()+" = "+user5.getCity()).forEach(i->System.out.println(i));
		
		
		
		//////////////////////////////////////////////////////////
//		List.of("Amruta","Shivani","Prnali","Vaibhavi","Shreya","Poorva").stream().filter(name->name.startsWith("P")).map(name->name.toUpperCase() + " = "+name.length()).forEach(i->System.out.println(i));
		
		//////////////////////////////////////////////////
//		Arrays.asList(1,3,6,4,2,8,9,4).stream().map(i->i*i).forEach(i->System.out.println((i)));
		
		
		////////////////////////////////////////////////////
//		User user=new User(1,"Sanika","sanika@gmail.com","Kolhapur");
//		User user1=new User(2,"Vedanti","vedanti@gmail.com","Kolhapur");
//		User user2=new User(3,"Asmita","asmii@gmail.com","Satara");
//		User user3=new User(4,"Shreya","shreya@gmail.com","Akluj");
//		User user4=new User(5,"Vaishnvai","vaishnvai@gmail.com","Lonavala");
		
//		Arrays.asList(user,user1,user2,user3,user4).stream().filter(userr->userr.getCity().equals("Kolhapur")).forEach(i->System.out.println(i));
//		Arrays.asList(user,user1,user2,user3,user4).stream().filter(user5->user5.getName().startsWith("S")).forEach(i->System.out.println(i));
//		Arrays.asList(user,user1,user2,user3,user4).stream().filter(user5->user5.getName().startsWith("S")&& user5.getCity().equals("Akluj")).forEach(i->System.out.println(i));
		//////////////////////////////////////////////////////////////
		
		
		
		
		
//		List<Integer> numbers=List.of(1,2,3,4,5,6,7,8,9,10);
//		
//		Stream<Integer> stream=numbers.stream();
//		
//		Stream<Integer> filtered=stream.filter(i->i%2==0);
//		
//		filtered.forEach(i->System.out.println(i));
		/////////////////////////////////////////////////////
//		List.of(1,2,3,4,5,6,7,8,9,10).stream().filter((i->i%2==0)).forEach(i->System.out.println(i));
		
		
		
		
		
	////	////////////////////////////////////////////////
//	String names[]= {"Seema","Anuradha","Swati","Pooja"};
//	
//	Arrays.asList(names).stream().filter((p)->p.startsWith("S")).forEach((c)->System.out.println(c));
	////////////////////////////////////////////////////
//	String names[]= {"Seema","Anuradha","Swati","Pooja"};
	
//	List<String> list=Arrays.asList(names);
//	
//	Stream<String> stream=list.stream();
//	
//	Stream<String> filtered=stream.filter((p)->{
//		
//		return p.startsWith("S");
//		
//	});
//	
//	filtered.forEach((c)->System.out.println(c));
	
		
		
		
		
		
		/////////////////////////////////////
//		List<String> str=Arrays.asList("Sita","Maya","Sushma");
//		for(String i:str)
//		{
//			if(i.startsWith("S"))
//			{
//				System.out.println(i);
//			}
//		}
		//////////////////////////////////////
//		List<Integer> numbers=Arrays.asList(11,22,33,44,55);
//		System.out.println(numbers);
		//////////////////////////////////////
//		List<Integer> numbers=List.of(1,2,3,4,5);
//		
//	     for(int i:numbers)
//	     {
//	    	 if(i%2==0)
//	    	 {
//	    		 System.out.println(i);
//	    	 }
//	     }
		///////////////////////////////////////
		
	}

}
