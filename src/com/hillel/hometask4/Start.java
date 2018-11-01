package com.hillel.hometask4;

public class Start {
    public static void main (String [] args) {

        double dollar = Methods.methodCourse(2800, 28);
        System.out.println("Dollars " + dollar);

        int sumOfNumbers = Methods.sumOfNumbers(678);
        System.out.println("Sum of numbers is " + sumOfNumbers);

        double p = Methods.perimetr(2.5, 4.8);
        System.out.println("Perimetr is " + p);

        double s = Methods.square(2.5, 4.8);
        System.out.println("Square is " + s);

        boolean result = Methods.ifTrainsCrash(4.5, 2.0);
        System.out.println(result);

        Methods.quadraticEquation(2,-7,2);
    }
}
