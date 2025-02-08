package com.poly.polyarray;

public class Animals {
    private int age;
    private  String sound;

    public Animals(int age,String sound)
    {
        this.age = age;
        this.sound = sound;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void getInfo()
    {
        System.out.println(age+"   "+sound);
    }
}
