package com.projiecct.pro1;

import java.util.ArrayList;
import java.util.Scanner;

public class Post {
    private String billInfo;
    private boolean billType;
    private double amount;
    private double balance;

    public double addIn(double balance, ArrayList<Bill> list)
    {
        Scanner sc = new Scanner(System.in);
        this.billType = true;
        this.balance = balance;//获取当前的账户余额

        System.out.println("----------收益入账----------");

        System.out.println("请输入收益金额");
        this.amount = sc.nextDouble();
        sc.nextLine();

        System.out.println("请输入收益来源");
        this.billInfo = sc.nextLine();

        Bill b = new Bill(this.billInfo,true,this.amount,amount + balance);
        list.add(b);

        return amount + balance;
    }

    public double addOut(double balance, ArrayList<Bill> list)
    {
        Scanner sc = new Scanner(System.in);
        this.billType = false;
        this.balance = balance;//获取当前的账户余额

        System.out.println("----------消费----------");

        System.out.println("请输入消费金额");
        this.amount = sc.nextDouble();
        sc.nextLine();

        System.out.println("请输入消费内容");
        this.billInfo = sc.nextLine();

        Bill b = new Bill(this.billInfo,false,this.amount,balance - amount);
        list.add(b);

        return balance - amount;
    }

}
