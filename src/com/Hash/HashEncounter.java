package com.Hash;

public class HashEncounter {
    public static void main(String[] args) {
        String a = new String("abc");
        String b = new String("abc");

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
    }
}
