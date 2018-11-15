package com.hillel.hometask9;

import com.hillel.helper.MyHelper;

public class MethodsOfHometask9 {

        public static int differenseOfSum (int [] array){
            int sumEven = 0;
            int sumOdd = 0;
        for (int i = 0; i < array.length; i++){
            if (array [i] % 2 == 0){
                sumEven = sumEven + array [i];
            }
            else {
                sumOdd = sumOdd +array [i];
            }
        }
            int dif = sumEven - sumOdd;
        return dif;
    }

          public static char [] swap (char [] chA, int ind1, int ind2) {
                  char old = chA[ind1];
                  chA[ind1] = chA[ind2];
                  chA[ind2] = old;
                 return chA;
              }

        public static double [] changePlasesOfNum (double [] a) {
                  double max = a[0];
                  double min = a[0];
                  int indexOfMax = 0;
                  int indexOfMin = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                indexOfMax = i;// определяем индексы максимального значения

            if (a[i] < min) {
                min = a[i];
                indexOfMin = i;// определяем индексы минимального значения
            }
        }

            double b = a[indexOfMax];
            double c = a[indexOfMin];
            a[indexOfMax] = c;
            a[indexOfMin] = b;
            for (int d = 0; d < a.length; d++) {
                System.out.print(a[d] + "; ");
        }
                }
             return a;
    }

    public static char[] reverseArray (char []a){

            for (int i = a.length - 1; i >= 0; i--) {

                System.out.print(a[i]+" ");
        }

        return a;
    }


    }








