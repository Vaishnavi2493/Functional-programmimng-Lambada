package com.Lambada2;

public class Student {

    private int rollNo;
    private String marks;
    private float per;

    public Student(int rollNo, String marks, float per) {
        this.rollNo = rollNo;
        this.marks = marks;
        this.per = per;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public float getPer() {
        return per;
    }

    public void setPer(float per) {
        this.per = per;
    }

    @Override
    public int hashCode() {
        return rollNo;
    }

   
}
