package com.Lambada2;

import java.util.HashSet;

public class Main3 
{
    public static void main(String[] args) 
    {
        Test3 t = () -> {

            HashSet<Student> students = new HashSet<>();

            Student s1 = new Student(11, "789", 84.9f);
            Student s2 = new Student(32, "678", 78.8f);
            Student s3 = new Student(53, "987", 90.6f);
            Student s4 = new Student(44, "456", 68.5f);

            students.add(s1);
            students.add(s2);
            students.add(s3);
            students.add(s4);

            return students;
        };

        HashSet<Student> students = t.getStudent();

        for (Student student : students) 
        {
            System.out.println(student.getRollNo());
            System.out.println(student.getMarks());
            System.out.println(student.getPer());
            System.out.println("-------------");
        }
    }
}
