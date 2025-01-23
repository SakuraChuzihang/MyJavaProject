package com.extend.test03;

public class PC extends Computer{
    private String brand;

    public PC(String hardDrive, String memory, String cpu, String brand) {
        super(hardDrive, memory, cpu);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void getDetail()
    {
        System.out.println("cpu:"+getCpu());
        System.out.println("内存:"+getMemory());
        System.out.println("硬盘:"+getCpu());
        System.out.println("品牌:"+this.brand);
    }
}
