package com.Lambada2;

import java.util.ArrayList;

public class Main 
{
	
	public static void main(String args[])
	{
		Test t=()->
		{
			
			ArrayList<Book> books=new ArrayList<Book>();
			
			Book b1=new Book(1,"Wings Of Fire","Dr.A.P.J.Abdul Kalam");
			Book b2=new Book(2,"The Alchemist","Paulo coelho");
			Book b3=new Book(3,"Harry Potter","J.K.Rowling");
			Book b4=new Book(4,"Godaan","Prem Chara");
			
			books.add(b1);
			books.add(b2);
			books.add(b3);
			books.add(b4);
			
			return books;
			
		};
		
		ArrayList<Book> books=t.getbooks();
		for(Book book:books)
		{
			System.out.println(book.getId());
			System.out.println(book.getName());
			System.out.println(book.getAuthor());
			System.out.println("---------------------------");
		}
		
	}

}
