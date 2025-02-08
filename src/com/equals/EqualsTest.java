package com.equals;

public class EqualsTest {
    public static void main(String[] args) {
        String a = new String("damn");
        String b = new String("damn");


        System.out.println(a == b);//两个对象之间的地址是否相等
        System.out.println(a.equals(b));//两个对象的值是否相等
    }
}
