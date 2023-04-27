package com.company.person;

public class Person {
    private String name;
    private int age;

    Person( ){
        System.out.println("Person Constructor");
    }

    public void jump(){
        System.out.println("Parent JUMP!");
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

