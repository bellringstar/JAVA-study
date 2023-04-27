package com.company.animal;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Monkey monkey = new Monkey();
        
        cat.eat("참치");
        cat.status();
        cat.Cry();
        dog.eat("뼈다귀");
        monkey.eat("바나나");

        cat.sleep();
        dog.sleep();
        monkey.sleep();
    }
}
