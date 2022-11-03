package com.company;

public class Triangle {
    int a;
    int b;
    int c;

    public void area(int a, int b, int c) {
        int d = (a + b + c) / 2;
        int s = d * (d - a) * (d - b) * (d - c);
        System.out.println(Math.sqrt(s));
    }
}
