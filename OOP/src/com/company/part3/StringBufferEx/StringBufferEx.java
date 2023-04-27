package com.company.part3.StringBufferEx;

public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer stringBuffer1 = new StringBuffer("Hello");
        stringBuffer1.insert(4, "world");
        System.out.println("stringBuffer1 = " + stringBuffer1);
    }
}
