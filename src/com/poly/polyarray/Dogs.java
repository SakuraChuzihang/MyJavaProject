package com.poly.polyarray;

public class Dogs extends Animals{
    private String act;

    public Dogs(int age, String sound, String act) {
        super(age, sound);
        this.act = act;
    }

    @Override
    public void getInfo() {
        System.out.println("i am a dog" + "i m "+getAge() + "years old" + getSound()+",i can "+ act);
    }
}
