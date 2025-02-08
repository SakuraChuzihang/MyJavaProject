package com.poly.polyParameter;

public class Mannger extends Employeer {
    private double bonus;

    public Mannger(double salary, String name, double bonus) {
        super(salary, name);
        this.bonus = bonus;
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }

    public void manage()
    {
        System.out.println("my name is"+super.getName()+"  I am a mannger,I have  bonus! lots of bonus!");
    }
}
