package com.poly.polyParameter;

public class Test {
    public static void main(String[] args){
        Employeer w = new Worker(5000,"Washington");
        Employeer m = new Mannger(20000,"Jim",500000);
        Test test = new Test();
        test.speak(w);
        test.speak(m);
    }

    public void speak(Employeer e)
    {
        if(e instanceof Worker)
        {
            ((Worker)e).work();
        }
        else if(e instanceof Mannger)
        {
            ((Mannger)e).manage();
        }
        else
        {
            System.out.println("你放进来的对象没搞对嗷。");
        }
    }

}
