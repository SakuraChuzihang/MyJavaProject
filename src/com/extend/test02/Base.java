package com.extend.test02;

public class Base extends TopBase{
    private String a;
    public Base(String a) {
        super(a);// 由于初代没有午餐构造器所以
        this.a = a;
        System.out.println("这里是二代的构造器");
        System.out.println("二代构造器的私有属性值为" + a);
        System.out.println(prot);
        System.out.println(de);
    }
}
