package com.poly.polyParameter;

public class Employeer {
    private double salary;
    private String name;

    public Employeer(double salary, String name)
    {
        this.salary = salary;
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnnual() {
        return salary * 12;
    }
}
