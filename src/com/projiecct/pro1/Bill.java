package com.projiecct.pro1;
import java.time.LocalDate;
import java.time.LocalTime;

public class Bill {
    private LocalDate date;
    private LocalTime time;
    private String billInfo;
    private boolean billType;
    private double amount;
    private double balance;
    private String timeFinal;


    public Bill(String billInfo, boolean billType, double amount, double balance) {
        date = LocalDate.now();
        time = LocalTime.now();
        this.billInfo = billInfo;
        this.balance = balance;
        this.billType = billType;
        this.amount = amount;

        String timeT = time.toString();
        timeFinal = timeT.substring(0,8);
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getBillInfo() {
        return billInfo;
    }

    public void setBillInfo(String billInfo) {
        this.billInfo = billInfo;
    }

    public boolean isBillType() {
        return billType;
    }

    public void setBillType(boolean billType) {
        this.billType = billType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {


        if (billType == true) {
            String formattedString = String.format("%-20s %-10s %-15s %-20s %-15s",
                    billInfo,
                    "+" + amount,
                    date,
                    timeFinal,
                    "余额：" + balance);
            return formattedString;
        }
        else
        {
            String formattedString = String.format("%-20s %-10s %-15s %-20s %-15s",
                    billInfo,
                    "-" + amount,
                    date,
                    timeFinal,
                    "余额：" + balance);
            return formattedString;
        }
    }
}
