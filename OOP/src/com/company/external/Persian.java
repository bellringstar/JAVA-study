package com.company.external;

public class Persian extends Cat{

    public Persian(){
        this.setHair("Long");
    }

    public Persian(String hair){
        setHair(hair);
    }
    @Override
    public void hunt() {
        System.out.println("Hunt Persian!" + getHair());
    }

    @Override
    void rus() {
        System.out.println("Run Persian");
    }
}
