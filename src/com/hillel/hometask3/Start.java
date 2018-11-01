package com.hillel.hometask3;

public class Start {
    public static void main(String[] args){
        int result = IsEvenNum.isEvenNum(101);
        int r = 101;

        if (result == 0) {
            System.out.println( "The number is even = " + r);
        }
        else {
            System.out.println("The number is odd = " + r);
        }


    }
}
