package com.hillel.hometask8;

import com.hillel.helper.MyHelper;

import java.util.Scanner;

public class Start {
    public static void main (String [] args){



        while (2 > 1){
            Scanner scan = new Scanner(System.in);
            System.out.println("Please, put your number from 1 to 10: ");
            int num = scan.nextInt();
            int r = MyHelper.getRandom(1, 10);

            if (num > r) {
                System.out.println("Your number is bigger than random number");
            }
            else if (num < r) {
                System.out.println("Your number is smaller than random number");
            }
            else {
                System.out.println("You guessed the number");
                break;

            }

        }

        System.out.println();

        int number =10;
        do {
            System.out.print(number + " ");
            number--;
        }
        while (number >= 1);


        System.out.println();


       long f= Methods.getFactorial(6);
       System.out.println("Factorial is " +f);


       Methods.arithmeticProgression(10,2,15);


    }

}
