package com.poly.DynamicBinding;

public class DynaTest {
    public static void main(String[] args) {
        Animal temp = new Dog();
        temp.getInfo();//方法绑定运行类型因此是num+10,但是属性是哪里调用就取用哪里，因此结果为20
    }
}

class Animal{
    int num = 12;

    public void getInfo()
    {
        System.out.println(num + 12);
    }
}

class Dog extends Animal{
    int num = 10;
    
    public void getInfo()
    {
        System.out.println(num + 10);
    }
}