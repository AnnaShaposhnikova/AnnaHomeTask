package com.hillel.hometask2;

public class MyCalc {
    public static double methodCalc1(double a, double b, double c) {
        double result = a + b * (c / 2);
        return result;
    }

    public static int methodCalc2(int a, int b) {
        int result = (a * a + b * b) % 2;
        return (byte) result;
    }

    public static double methodCalc3(double a, int b, int c) {
        double result = (a + b) / 12 * c % 4 + b;
        return result;
    }

    public  static  int methodCalc4(int a, int b, int c) {
        int result = (a - b * c) / (a + b) % c;
        return (byte) result;

    }

}
