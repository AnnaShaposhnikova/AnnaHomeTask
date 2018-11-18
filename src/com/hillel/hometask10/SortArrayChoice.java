package com.hillel.hometask10;

public class SortArrayChoice {
    public static void swap (int [] arr, int ind1, int ind2){


        int old = arr [ind2];
        arr [ind2] = arr [ind1];
        arr [ind1] = old;


    }

    public static int getMin (int [] arr, int x){
        int min = arr [x];
        int minInd = x; //индекс минимального значения
        for (int i = x; i < arr.length; i++){
            if (arr [i] < min) {
                min = arr [i];
                minInd = i;
            }
        }
        return minInd;
    }

    public static void sort (int [] a){

        for (int i = 0; i < a.length; i++){

            swap(a, getMin(a, i),i);

        }

    }
}

