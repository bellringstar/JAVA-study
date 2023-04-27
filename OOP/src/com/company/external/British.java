package com.company.external;

public class British extends Cat {

    public British(){
        this.setHair("Short");
    }

    public British(String hair){
        this.setHair(hair);
    }


    @Override
    public void hunt() {
        System.out.println("British Hunt!" + getHair());
    }

    @Override
    void rus() {
        System.out.println("British Run!");

    }
}
