package com.homework.Chapter7.hw06;

public class Doctor {
    private String name;
    private int age;
    private String gender;
    private String job;
    private double sal;

    public Doctor(String name, int age, String gender, String job, double sal) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.job = job;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
