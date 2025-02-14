package com.projiecct.pro2;

import com.projiecct.pro1.Bill;
import com.projiecct.pro1.Post;

import java.util.ArrayList;
import java.util.Scanner;

public class ChangeMenu {
    private String billInfo;
    private boolean billType;
    private double amount;
    private double balance;

    public double addIn(double balance, ArrayList<Bill> list)//账单的收益添加功能
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

    public double addOut(double balance, ArrayList<Bill> list)//账单的消费添加功能
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

    public void menuServer()//系统的服务菜单功能，内部调用了以上两个功能
    {
        boolean isLoop = true;
        Scanner sc = new Scanner(System.in);
        int userChoice;
        double nowBalance =0;


        ArrayList<Bill> list = new ArrayList<Bill>();


        do{
            System.out.println("-----------------------------零钱通菜单-----------------------------");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退出");
            System.out.println("请选择1-4：");

            userChoice = sc.nextInt();

            switch(userChoice){
                case 1:
                    for(Bill temp : list){
                        System.out.println(temp);
                    }
                    break;
                case 2:
                    nowBalance += this.addIn(nowBalance,list);
                    break;
                case 3:
                    nowBalance -= this.addOut(nowBalance,list);
                    break;
                case 4:
                    System.out.println("选择了退出");
                    isLoop = false;
                    break;
            }
            System.out.println("\n\n");
        }while(isLoop);
    }

}
