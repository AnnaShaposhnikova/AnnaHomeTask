package com.hillel.helper;

public class MyHelper {
    public static int getRandom (int min, int max){
        return (int)(Math.random()*(max-min+1))+min;// случайное число в диапазоне от мах до мin, min<=rnd<=max
    }

    public static void showArray(int [] a){
        for (int i = 0; i <a.length; i++){
            System.out.print(a [i] + "; ");
        }
    }
    public static void showArrayChar(char [] a){
        for (int i = 0; i <a.length; i++){
            System.out.print(a [i] + "; ");
        }
    }
//    public static void main (String[] args){wew
//
//        System.out.println(getRandom(-1,1));
//

    }



