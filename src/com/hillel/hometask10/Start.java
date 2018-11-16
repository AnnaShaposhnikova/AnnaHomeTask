package com.hillel.hometask10;

import com.hillel.helper.MyHelper;

public class Start {
    public static void main(String[] args) {
        int[] arr = {3, 7, 0, 2, 4, 1};
        SortArrayChoice.sort(arr);
        MyHelper.showArray(arr);

        System.out.println();

        int arr1[] = new int[10];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = MyHelper.getRandom(0,100);
            System.out.print(arr1[i] + " ");

        }
        System.out.println();

        BubleSort.bubleSort(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
