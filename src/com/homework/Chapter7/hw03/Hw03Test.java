package com.homework.Chapter7.hw03;

public class Hw03Test {
    public static void main(String[] args) {
        Manager manager = new Manager("陈红", 25);
        Staff staff = new Staff("张超", 30);

        manager.salaryPrint();
        staff.salaryPrint();
    }
}
