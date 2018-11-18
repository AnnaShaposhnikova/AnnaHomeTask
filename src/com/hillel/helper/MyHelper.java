package com.hillel.helper;

public class MyHelper {
    public static int getRandom(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;// случайное число в диапазоне от мах до мin, min<=rnd<=max
    }


    public static void showArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "; ");
        }
    }

    public static void showArrayChar(char[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "; ");
        }
    }

    public static void swap(int[] arr, int ind1, int ind2) {


        int old = arr[ind2];
        arr[ind2] = arr[ind1];
        arr[ind1] = old;


    }

    public static boolean isUnicNum(int rnd, int arr[]) {
        for (int number : arr) {
            if (number == rnd) {
                return false;
            }
        }
        return true;
    }

//    public static void main(String[] args) {
//
//        System.out.println(getRandom(0,8));
////
//
//    }
}



