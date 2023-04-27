package com.company.animal;

public class Monkey implements Animal{
    @Override
    public void eat(String foodType) {
        System.out.println("원숭이가 " + foodType + " 먹습니다.");
    }

    @Override
    public void sleep() {
        System.out.println("원숭이가 잡니다.");
    }
}
