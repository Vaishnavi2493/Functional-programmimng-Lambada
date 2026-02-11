package com.FunctionalProgramming.Lambada;

public class Main2 {
    public static void main(String[] args) {

        Test2 t = (arr) -> {
            int count = 0;

            for (int x : arr) {
                if (x % 2 == 0) {
                    count++;
                }
            }
            return count;
        };

        int[] a = {11, 22, 33, 44, 55, 66, 77, 88, 99,100};

        int result = t.count(a);
        
        System.out.println("Even numbers count: " + result);
    }
}
