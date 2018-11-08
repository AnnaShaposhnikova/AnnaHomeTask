package com.hillel.helper;

public class MyHelper {
    public static int getRandom (int min, int max){
        return (int)(Math.random()*(max-min+1))+min;// случайное число в диапазоне от мах до мin, min<=rnd<=max
    }

//    public static void main (String[] args){
//
//        System.out.println(getRandom(-1,1));
//

    }



