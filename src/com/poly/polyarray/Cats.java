package com.poly.polyarray;

import com.poly.polyarray.Animals;

public class Cats extends Animals {
    private String act;
    public Cats(int age,String sound,String act) {
        super(age,sound);
        this.act = act;
    }

    @Override
    public void getInfo() {
        System.out.println("i am a cat" + "i m "+getAge() + "years old" + getSound());
    }
}
