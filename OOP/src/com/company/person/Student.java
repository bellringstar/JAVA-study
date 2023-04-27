package com.company.person;

public class Student extends Person{

    private String stdNo;

    Student() {
        System.out.println("Student Constructor");
    }

    public void setStdNo(String stdNo) {
        this.stdNo = stdNo;
    }

    public String getStdNo() {
        return stdNo;
    }

    public void jump() {
        System.out.println("Student Jump!");
    }

    public void status() {
        System.out.println("Name: " + super.getName() + "age: " + getAge() + "stdNo: " + getStdNo());
        super.jump();
    }

    
}

