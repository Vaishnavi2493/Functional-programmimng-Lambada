package com.FunctionalProgramming;

public class Calculator 
{
	
	public static void calculate(AO ao)
	{
	ao.calculate(100, 10);	
	}
	public static void main(String args[])
	{
//	Calculator.calculate(new Addition());
//	Calculator.calculate(new Substraction());
//	Calculator.calculate(new Multiplication());
//	Calculator.calculate(new Division());
		
	///Functional
	
		Calculator.calculate(( a, b)->System.out.println("Addition: " +(a+b)));
         
		Calculator.calculate(( a, b)->System.out.println("Substraction: " +(a-b)));
		
		Calculator.calculate(( a, b)->System.out.println("Multiplication: " +(a*b)));
		
		Calculator.calculate(( a, b)->System.out.println("Division: " +(a/b)));
		
	}

}
