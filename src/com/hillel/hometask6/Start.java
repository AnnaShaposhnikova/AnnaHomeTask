package com.hillel.hometask6;

import com.hillel.helper.MyHelper;

import java.util.Scanner;

public class Start {
    public static void main (String[] args){
        System.out.println("Sum of numbers from 1 to 100 is "+MethodsOfHomeTask6.getSum());



        for (int i = 1; i < 100; i++) {//get odd numbers from 1 to 100

            if (i % 2 == 1) {
                System.out.print(i + "  ");
            }
        }

        System.out.println();


        int Head=0, Tale=0;
        for (int i = 0; i<2000; i++) {

           int r= MyHelper.getRandom(0, 1);{
               if (r==1){
                   Head++;
               }
               else {
                   Tale++;
               }
            }

        }
        System.out.println(Head);
        System.out.println(Tale);




            for (int row = 1; row <= 5; row++) {
                for (int column = 1; column <= 5; column++) {
                    if (row == column){
                        System.out.print("1 ");}

                     else {
                        System.out.print("0 ");
                                    }
                }
                System.out.println();
            }

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please, put your birth year: ");
        int number=scanner.nextInt();
        int year = 2018;
        int age=year - number;
        System.out.println("Your age is: "+age);


        System.out.println("Sum of random numbers between -20...20 is: "+MethodsOfHomeTask6.getSumOfRandomNum1());
        System.out.println("Sum of random numbers between -10...9 is: "+MethodsOfHomeTask6.getSumOfRandomNum2());

        String str = "Одесса мой город родной";
        char[] chArray = str.toCharArray();
        for (int i=0;i<chArray.length; i++){
            if (chArray[i]== 'о'){
                System.out.println(i);
            }
            System.out.println();
        String str1 = "Одесса мой город родной";
            for (int a=0; a < str1.length(); a++){
                if (str1.charAt(a) == 'о'){
                    System.out.println(a);
                }
            }
        }


}
}

