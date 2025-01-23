package com.extend.test03;

public class TestComputer {
    public static void main(String[] args)
    {
        NotePad notePad = new NotePad("512GB","8G","骁龙8 elite","白色");
        PC pc = new PC("512GSSD","16GB DDR4","intelCorei9","黑色");

        notePad.getDetail();
        pc.getDetail();
    }
}
