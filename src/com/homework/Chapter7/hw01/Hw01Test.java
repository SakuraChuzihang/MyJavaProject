package com.homework.Chapter7.hw01;

public class Hw01Test {
    public static void main(String[] args) {
        Person[] p = new Person[3];
        p[0]  = new Person("小红", "医生", 24);
        p[1]  = new Person("王翔", "网红", 33);
        p[2]  = new Person("张雷", "工程管理", 23);

        for (int i = 0; i < p.length - 1; i++) {
            for (int j = 0; j < p.length - i - 1; j++) {
                Person temp = new Person();
                if(p[j + 1].getAge() < p[j].getAge()){
                    temp = p[j];
                    p[j] = p[j + 1];
                    p[j + 1] = temp;
                }
            }
        }

        for (int j = 0; j < p.length; j++) {
            System.out.println(p[j]);
        }
    }
}
