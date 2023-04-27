package com.company.person;

public class PersonRun {
    public static void main(String[] args) { //static = 메모리에 고정
        Person person = new Person();
        person.setName("Hong");
        person.setAge(20);
        System.out.println("person.getName() = " + person.getName());
        Student student = new Student();
        student.setName("Kim");
        student.setAge(15);
        student.setStdNo("12039123");
        student.status();
    }
}
