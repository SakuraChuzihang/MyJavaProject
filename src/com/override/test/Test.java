package com.override.test;

public class Test {
    public static void main(String[] args)
    {
        Person p = new Person("柳依依",6);
        Students students = new Students(2016456, 448, "柳依依", 23);

        System.out.println(p.say());
        System.out.println(students.say());
    }
}
