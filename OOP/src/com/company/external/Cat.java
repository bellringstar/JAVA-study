package com.company.external;

public abstract class Cat {


    // 필드
    public String name;
    private int age;
    private String hair;

    // 메서드
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    public void setHair(String hair){
        this.hair = hair;
    }
    public String getHair(){
        return this.hair;
    }

    public abstract void hunt();
    abstract void rus();

}
