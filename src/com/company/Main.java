package com.company;

public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.a = 25;
        triangle.b = 25;
        triangle.c = 25;
        triangle.area(triangle.a, triangle.b, triangle.c);
    }
}