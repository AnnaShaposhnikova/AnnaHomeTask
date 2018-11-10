package com.hillel.hometask7;

public class Start {
    public static void main (String [] args){
        int[] aIntNums = {-10, 20, 34, -11, 100 , 20};
        double[] aDoubleNums = {10.10, 43.543, 0.01, 1.3, 0.1, 43.4, 0.001 };

        int max = Methods.getMaxNum(aIntNums);
        System.out.println("Max int num is: " +max);

        int min = Methods.getMinNum(aIntNums);
        System.out.println("Min int num is: " +min);

        double max1 = Methods.getMaxNum(aDoubleNums);
        System.out.println("Max double num is: " +max1);

        double min1 = Methods.getMinNum(aDoubleNums);
        System.out.println("Min double num is: " +min1);

    }
}
