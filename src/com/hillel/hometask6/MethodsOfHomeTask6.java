package com.hillel.hometask6;

import com.hillel.helper.MyHelper;

public class MethodsOfHomeTask6 {
    public static int getSum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        return sum;
    }
    public static int getSumOfRandomNum1(){
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + MyHelper.getRandom(-20, 20);
        }
        return sum;
    }
    public static int getSumOfRandomNum2 (){
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + MyHelper.getRandom(-10,9);
        }
        return sum;
    }



}
