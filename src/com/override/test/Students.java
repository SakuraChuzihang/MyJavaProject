package com.override.test;

public class Students extends Person{
    private int id;
    private int score;

    public Students(int id, int score, String name, int age)
    {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public String say()
    {
        String ret = super.say() + "my studyID is "+ id + " and score is "+ score;
        return ret;
    }
}
