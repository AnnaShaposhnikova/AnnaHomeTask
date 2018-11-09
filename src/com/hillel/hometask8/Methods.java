package com.hillel.hometask8;

public class Methods {
    public static long getFactorial (int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial =  factorial * i;

        }
        return factorial;

    }

    public static void arithmeticProgression (int start, int delta, int num){
            for (int  i = start; i <= start + delta * (num - 1); ){
            i = i + delta;
            System.out.print(i + " ");

        }


    }


}
