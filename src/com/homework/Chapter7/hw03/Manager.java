package com.homework.Chapter7.hw03;

public class Manager extends Employeer{
    public Manager(String name, int workDays) {
        super(name, 500, workDays);
    }

    @Override
    public void salaryPrint() {
        System.out.println("我的工资是"
                + (super.getDailySalary() * super.getWorkDays()*1.2 + 1000)
                + "元。");
    }
}
