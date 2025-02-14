package com.homework.Chapter7.hw02;

public class AssociateProfessor extends Teacher{
    public AssociateProfessor(String name, int age){
        super(name, age, "副教授", 12000);
    }

    @Override
    public void introduce() {
        System.out.println("我是一名大学老师，我的名字叫做"
                + super.getName()
                + "，我的年龄是"
                + super.getAge() + "岁，我的职位是"
                + super.getPost() + "，我每月的收入是"
                + super.getSalary()
                +"。");
    }
}
