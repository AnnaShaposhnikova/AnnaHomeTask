package com.hillel.hometask2;

public class Start {
    public static void main (String[] args) {

        double x = MyCalc.methodCalc1(12D,4.45, 7.0);
        System.out.println("12 + 4.45 * ( 7 / 2 ) =  " + x);

       int r = MyCalc.methodCalc2(4, 3);
        System.out.println("(4 * 4 + 3 * 3 ) % 2 = " + r);

       double y = MyCalc.methodCalc3(6.5, 9, 7);
        System.out.println("(6.5 + 9) / 12 * 7 % 4 + 9 = " + y);

        int k = MyCalc.methodCalc4( 6, 7, 8);
        System.out.println("(6 - 7 * 8) / (6 + 7) % 8 = " + k);



    }
}
