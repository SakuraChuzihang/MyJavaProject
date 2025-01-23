package com.extend.test03;

public class Computer {
    private String cpu;
    private String memory;
    private String hardDrive;

    public Computer(String hardDrive, String memory, String cpu) {
        this.hardDrive = hardDrive;
        this.memory = memory;
        this.cpu = cpu;
    }

    public String getCpu() {
        return cpu;
    }

    public String getMemory() {
        return memory;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void getDetail()
    {
        System.out.println("cpu:"+cpu);
        System.out.println("内存:"+memory);
        System.out.println("硬盘:"+cpu);
    }
}
