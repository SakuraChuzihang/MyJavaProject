package com.poly.polyarray;

import java.sql.SQLOutput;

public class Humans extends Animals {
    private String skill;

    public Humans(int age, String sound, String skill) {
        super(age, sound);
        this.skill = skill;
    }

    @Override
    public void getInfo() {
        System.out.println("i am a human" + "i m "+getAge() + "years old" + getSound()+",i can "+ skill);
    }

    public void study()
    {
        System.out.println("i am a human, so i can learn everything!");
    }
}
