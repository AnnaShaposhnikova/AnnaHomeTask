package com.hillel.hometask11;

import com.hillel.helper.MyHelper;

public class PasswordGenerator {

    private static char [] lowerSymbol = {'A','B','C','D','E','F','G','H','I','G','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    private static char [] upperSymbol = {'a','b','c','d','e','f','g','h','i','g','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    private static  char [] nums = {'1','2','3','4','5','6','7','8','9','0'};

    final private static char UNDER_SKOR = '_';
    final private static int MAX_RND = 8;
    final private static int MIN_RND = 0;
    final private static int TOTAL_NUMBER = 8;
    private static char[] arr = new char[TOTAL_NUMBER];


    public static void main(String[] args) {

        int r = MyHelper.getRandom(0, 1);

        if (r == 1) {
            arr[0] = nums[MyHelper.getRandom(0, nums.length - 1)];
            arr[1] = nums[MyHelper.getRandom(0, nums.length - 1)];
        } else {
            arr[0] = nums[MyHelper.getRandom(0, nums.length - 1)];
            arr[1] = UNDER_SKOR;
        }

        for (int i = 2; i < 5; i++) {
            arr[i] = lowerSymbol[MyHelper.getRandom(0, lowerSymbol.length - 1)];

        }
        for (int i = 5; i < arr.length; i++) {
            arr[i] = upperSymbol[MyHelper.getRandom(0, upperSymbol.length - 1)];
        }
//        MyHelper.showArrayChar(arr);
//        System.out.println();

        int [] mixArr = new int[arr.length];

        int counter = 0;

        do {
            int rnd = MyHelper.getRandom(MIN_RND,MAX_RND-1);
            if (MyHelper.isUnicNum(rnd,mixArr)) {
                mixArr[counter] = rnd;
                counter++;
            }
        }
        while (counter < mixArr.length-1);

//            MyHelper.showArray(mixArr);
//        System.out.println();

        char [] arr1 = new char[arr.length];
        for (int i = 0; i < arr.length; i++){
            arr1[i] = arr[mixArr[i]];
        }
        System.out.print(arr1);
    }
}





