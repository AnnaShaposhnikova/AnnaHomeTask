package com.hillel.hometask7;

public class Methods {
    public static int getMaxNum(int[] aIntNum) {
        int max = aIntNum[0];
        for (int i = 0; i < aIntNum.length; i++) {
            if (aIntNum[i] > max) {
                max = aIntNum[i];
            }
          }
        return max;
    }

    public static int getMinNum(int[] aIntNum) {
        int min = aIntNum[0];
        for (int i = 0; i < aIntNum.length; i++) {
            if (aIntNum[i] < min) {
                min = aIntNum[i];
            }
        }
        return min;
    }

    public static double getMaxNum(double[] aDoubleNum) {
        double max = aDoubleNum[0];
        for (int i = 0; i < aDoubleNum.length; i++) {
            if (aDoubleNum[i] > max) {
                max = aDoubleNum[i];
            }
        }
        return max;
    }

    public static double getMinNum(double[] aDoubleNum) {
        double min = aDoubleNum[0];
        for (int i = 0; i < aDoubleNum.length; i++) {
            if (aDoubleNum[i] < min) {
                min = aDoubleNum[i];
            }
        }
        return min;
    }


}

