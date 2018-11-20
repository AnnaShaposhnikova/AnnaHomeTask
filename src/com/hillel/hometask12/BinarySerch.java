package com.hillel.hometask12;

public class BinarySerch {

    public static boolean binarySerch(int[] arr, int num) {
        int left = 0;
        int right = arr.length;
        int mid = 0;
        while (right > left) {
            mid = left +(int)(right - left) / 2 ;

            if (arr[mid]< num) {
                left = mid+1;
            } else if (arr[mid] > num) {
                right = mid;
            } else if (arr[mid] == num) {
                return true;
            }
            else {
                break;

            }


        }
        return false;
    }
}
