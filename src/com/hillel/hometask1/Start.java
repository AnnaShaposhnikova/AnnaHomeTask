package com.hillel.hometask1;

public class Start {

    public static void main(String[] args) {
	int r = Calculator.add(5, 7);
        System.out.println("5 + 7 = " + r);

        r = Calculator.sub(100, 35);
        System.out.println("100 - 35 = " + r);

        r = Calculator.div(200, 50);
        System.out.println("200 / 50 = " + r);

        r = Calculator.mul(33, 3);
        System.out.println("33 * 3 = " + r);

        double t = Calculator.add(10.5, 12.2);
        System.out.println("10.5 + 12.2 = " + t);

        t = Calculator.sub(100D,40D);
        System.out.println("100 - 40 = " + t);

        t = Calculator.div(25.8, 7D);
        System.out.println("25.8 / 7 = " + t);

        t = Calculator.mul(11D, 5.5);
        System.out.println("11 * 5.5 = " + t);


    }
}
