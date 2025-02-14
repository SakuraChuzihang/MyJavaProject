package com.homework.Chapter7.hw03;

public class Staff extends Employeer{
    public Staff(String name, int workDays) {
        super(name, 150, workDays);
    }

    @Override
    public void salaryPrint() {
        System.out.println("我的工资是"
                + super.getDailySalary() * super.getWorkDays()
                + "元。");
    }
}
