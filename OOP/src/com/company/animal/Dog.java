package com.company.animal;

public class Dog implements Animal {

    @Override
    public void eat(String foodType) {
        System.out.println("강아지가 " + foodType + " 먹습니다.");
    }


}
