package com.projiecct.pro1;

import java.util.ArrayList;
import java.util.Scanner;

public class SmallChangeMenu {
    public static void main(String[] args) {
        boolean isLoop = true;
        Scanner sc = new Scanner(System.in);
        int userChoice;
        double nowBalance =0;


        ArrayList<Bill> list = new ArrayList<Bill>();
        Post post = new Post();





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
                    nowBalance += post.addIn(nowBalance,list);
                    break;
                case 3:
                    nowBalance -= post.addOut(nowBalance,list);
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
