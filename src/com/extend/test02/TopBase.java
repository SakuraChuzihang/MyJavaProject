package com.extend.test02;

public class TopBase {
    private String words;
    int de = 10086;
    protected int prot = 10000;
    public int pubc = 7758258;

    public TopBase(String words) {
        System.out.println("这里是初代的构造器。");
        System.out.println("初代构造器接收的参数是"+ words);
        this.words = words;
    }

    public void declares()
    {
        System.out.println("这里是初代的方法。");
    }
}
