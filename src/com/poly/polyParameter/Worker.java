package com.poly.polyParameter;

public class Worker extends Employeer{
    public Worker(double salary, String name) {
        super(salary, name);
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }

    public void work() {
        System.out.println("i a m a worker,i have no bonus!damn!");
    }
}
