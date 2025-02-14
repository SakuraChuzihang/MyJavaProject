package com.equals;

public class Test2 {
    public static void main(String[] args) {
        Person a = new Person("张三",45,'男');
        Person b = new Person("张三",45,'男');
        Person c = new Person("王帅",46,'男');

        System.out.println(a.equals(b));//true
        System.out.println(a.equals(c));//false
    }


}
