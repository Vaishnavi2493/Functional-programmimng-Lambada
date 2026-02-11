package com.Lambada2;

public class Main4 
{
	
	public static void main(String args[])
	{
		Test4<Integer[], String[], Integer[]> t = (a, b) -> {
            return a;   
        };

        int[] result = t.fun(
            new int[] {1, 2, 3, 4},
            new String[] {"Ram", "Shyam"}
        );

        for (int i : result) {
            System.out.println(i);
        }
		
//		Test4<Integer,Integer,Integer> t=(a,b)->
//		{
//			return a+b;
//		};
//		
//		System.out.println(t.add(45, 45));
		
		
//		Test4<Integer,String,Integer> t=(i,j)->
//		{
//			return i;
//		};
//		
//		int x=t.add(111, "Sidhuu");
//		System.out.println(x);
		
		
//		Test4<Integer,Float> t=(a,b)->
//		{
//			System.out.println(a+b);
//		};
//		t.add(78, 45.9f);
//		///////////////////
//		Test4<Float,Integer> t1=(a,b)->
//		{
//			System.out.println(a+b);
//		};
//		t1.add(56.7f,78);
//		////////////////////
//		Test4<Double,String> t2=(a,b)->
//		{
//			System.out.println(a+b);
//		};
//		
//		t2.add(45.45,"Ram");	
//		////////////////////
//		Test4<Double,String> t3=(a,b)->
//		{
//			System.out.println(a+b);
//		};
//		
//		t2.add(45.45,"Ram");	
		
		
//	Test4<Integer[],String[]> t5=(a,b)->
//	{
//		for(int i:a)
//		{
//			System.out.println(i);
//		}
//		for(String j:b)
//		{
//			System.out.println(j);
//		}
//	};
//	
//		t5.add(new Integer[] {12,11,13,14,14}, new String[] {"Ram","Hari","Omii","Tushh"});	
		
		
		
		
		
//		Test4<Integer> t=(a,b)->
//		{
//			System.out.println(a+b);
//		};
//		t.add(78, 45);
//		///////////////////
//		Test4<Float> t1=(a,b)->
//		{
//			System.out.println(a+b);
//		};
//		t1.add(56.4f,78.7f);
//		////////////////////
//		Test4<Double> t2=(a,b)->
//		{
//			System.out.println(a+b);
//		};
//		
//		t2.add(45.45,7.7);
//		/////////////////////
//		Test4<String> t3=(a,b)->
//		{
//		System.out.println(a+b);
//		};
//		
//		t3.add("Vaishnavi"  ,  "Sakunde");
//		//////////////////////
//		
//		Test4<int[]>t4=(a,b)->
//		{
//			for(int i:a)
//			{
//				System.out.println(i);
//			}
//			for(int j:b)
//			{
//				System.out.println(j);
//			}
//		};
//		
//		t4.add(new int[] {1,2,3,4},new int[] {5,6,7,8});
	}

}
