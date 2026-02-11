package com.Lambada2;

import java.util.ArrayList;

public class Main2 
{
	public static void main(String args[])
	{
		Test2 t =()->
		{
			ArrayList<Product> product=new ArrayList<Product>();
			Product p1=new Product("Sugar",40);
			Product p2=new Product("Rice",90);
			Product p3=new Product("Pariwar",450);
			Product p4=new Product("Poha",30);
			
			product.add(p1);
			product.add(p2);
			product.add(p3);
			product.add(p4);
			
			return product;
		};
		
		ArrayList<Product> product=t.getProduct();
		
		for(Product produc:product)
		{
			System.out.println(produc.getName());
			System.out.println(produc.getPrice());
			System.out.println("----------------------------");
		}
	}

}
