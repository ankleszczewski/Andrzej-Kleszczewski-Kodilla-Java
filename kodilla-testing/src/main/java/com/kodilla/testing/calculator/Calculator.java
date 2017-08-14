package com.kodilla.testing.calculator;

public class Calculator {
    static int a;
    static int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static int add() {
        return a + b;
    }

    public static  int substract() {
        return a - b;
    }
}
