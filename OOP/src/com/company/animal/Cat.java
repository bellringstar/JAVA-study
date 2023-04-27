package com.company.animal;

public class Cat implements Animal,AnimalDetail {


    @Override
    public void eat(String foodType) {
        System.out.println("고양이가 " + foodType + " 먹습니다." );
    }

    @Override
    public void sleep() {
        System.out.println("고양이가 잡니다.");
    }

    @Override
    public void Cry() {
        System.out.println("야옹");
    }
    public void status(){
        System.out.println(LEGS);
        System.out.println(EYES);
    }
}
