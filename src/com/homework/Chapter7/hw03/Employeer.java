package com.homework.Chapter7.hw03;

public class Employeer {
    private String name;
    private double dailySalary;
    private int workDays;

    public Employeer(String name, double dailySalary, int workDays) {
        this.name = name;
        this.dailySalary = dailySalary;
        this.workDays = workDays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDailySalary() {
        return dailySalary;
    }

    public void setDailySalary(double dailySalary) {
        this.dailySalary = dailySalary;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    public void salaryPrint()
    {
        System.out.println("我的工资是"
                + dailySalary * workDays
                + "元。");
    }
}
