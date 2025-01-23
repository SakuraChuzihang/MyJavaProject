package com.override.test;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person()
    {

    }

    public String say()
    {
        String ret = "Hello everyone,my name is "+ name +" and age is "+ age;
        return ret;
    }
}
