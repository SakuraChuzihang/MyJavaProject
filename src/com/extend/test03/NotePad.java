package com.extend.test03;

public class NotePad extends Computer{
    private String color;

    public NotePad(String hardDrive, String memory, String cpu, String color) {
        super(hardDrive, memory, cpu);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void getDetail()
    {
        System.out.println("cpu:"+getCpu());
        System.out.println("内存:"+getMemory());
        System.out.println("硬盘:"+getHardDrive());
        System.out.println("颜色:"+getColor());

    }
}
