package com.example.javatest.innerclass;

class OutClass{
    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;
    public OutClass(){
        inClass = new InClass();
    }
    private class InClass{
        int iNum = 100;

        void inTest() {
            System.out.println("num = " + num);
            System.out.println("sNum = " + sNum);
            System.out.println("iNum = " + iNum);
        }
    }

    public void usingClass(){
        inClass.inTest();
    }

    static class InStaticClass {
        int iNum = 100;
        static int sInNum = 200; //static class 이기 때문에 내부 클래스일지라도 외부클래스가 생성되기 이전에 사용이 가능하다.

        void inTest() {
            System.out.println("num = " + sInNum);
            System.out.println("sNum = " + sNum);
            System.out.println("iNum = " + iNum);
        }

        static void sTest(){
            System.out.println("num = " + sInNum);
            System.out.println("sNum = " + sNum);
//            System.out.println("iNum = " + iNum); static메서드 이기 때문에 class가 생성되기 전에 사용될 수 있으므로 내부 변수 사용 불가
        }


    }

}

public class InnerClass {

    // OutClass.InClass inner = outClass.new InClass(); 이너클래스가 private가 아닐 경우 생성이 가능하긴 하다.
    public static void main(String[] args) {
        OutClass out = new OutClass();
        out.usingClass();
    }
}
