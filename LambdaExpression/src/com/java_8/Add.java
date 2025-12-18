package com.java_8;

@FunctionalInterface
interface I3 {
    int add(int a, int b);
}

public class Add {
    public static void main(String[] args) {
        I3 i = (a, b) -> a + b;

        int res = i.add(10, 20);
        System.out.println("sum : " + res);
    }
}
