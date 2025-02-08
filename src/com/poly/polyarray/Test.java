package com.poly.polyarray;

public class Test {
    public static void main(String[] args)
    {
        Animals[] arr = new Animals[3];

        arr[0] = new Cats(2,"miaoamiao","eat fish");
        arr[1] = new Dogs(1,"wangwang","eat bone");
        arr[2] = new Humans(13,"fk you dude","jerk off");



        for (int i = 0; i < arr.length; i++) {
            arr[i].getInfo();
            if(arr[i] instanceof Humans)
            {
                ((Humans)arr[i]).study();
            }
        }
    }
}
