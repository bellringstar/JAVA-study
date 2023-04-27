package com.company.animal;

public interface Animal {

    void eat(String foodType);
    default void sleep(){
        System.out.println("잡니다...");
    };
}
