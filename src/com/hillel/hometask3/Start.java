package com.hillel.hometask3;

public class Start {
    public static void main(String[] args){
        int result = IsEventNum.isEventNum(101);
        int r = 101;

        if (result == 0) {
            System.out.println( "The number is event = " + r);
        }
        else {
            System.out.println("The number is odd = " + r);
        }


    }
}
