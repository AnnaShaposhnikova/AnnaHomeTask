package com.hillel.hometask9;

import com.hillel.helper.MyHelper;

public class Start9 {
    public static void main (String [] args){
        int [] array = {8, 9, 10, 11, 12, 13};
        int difference = MethodsOfHometask9.differenseOfSum(array);
        System.out.println("Differense of sum of even and odd numbers is: "+difference);


        char [] chArray = {'r', 'o', 'l', 'o', 'c'};
        char [] newChArray = MethodsOfHometask9.swap(chArray,0, chArray.length-1);
        MyHelper.showArrayChar(newChArray);

        System.out.println();

       double [] dArray = {23.56, 50D, 100.01, 65.74};
       double [] newDArray = MethodsOfHometask9.changePlasesOfNum(dArray);
        System.out.println();



        int [] fTeam = new int [25];
        for (int i = 0; i < fTeam.length; i++) {
            fTeam [i] = MyHelper.getRandom(10, 100);
        }
        MyHelper.showArray(fTeam);

        System.out.println();

        int [] sTeam = new int [25];
        for (int i = 0; i < sTeam.length; i++) {
            sTeam [i] = MyHelper.getRandom(10, 100);
        }

        MyHelper.showArray(sTeam);

        System.out.println();

         int sum1 = 0;
         int sum2 = 0;

         for (int x: fTeam){
             sum1 = sum1 + x;
         }
            int average1 = sum1 / fTeam.length;


         for (int x: sTeam){
             sum2 = sum2 + x;
         }
           int  average2 = sum2 / sTeam.length;

//            System.out.println(average1);
//            System.out.println(average2);

            if (average1 > average2){
                System.out.println("The average age of the first team is greater");
            }
            else if (average1 < average2){
                System.out.println("The average age of the second team is greater");
            }
            else {
                System.out.println("Team ages are equal");

            };

        System.out.println();

        char [] arrayChar = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};

        MethodsOfHometask9.reverseArray(arrayChar);



    }



}
