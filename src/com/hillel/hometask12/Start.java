package com.hillel.hometask12;

import com.hillel.hometask10.BubleSort;

public class Start {
    public static void main(String[] args) {
        int[] arr = {2, 20, 17, 25, 84, 13, 65, 54, 32};
        int num = 100;
        BubleSort.bubleSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println(BinarySerch.binarySerch(arr, num));
    }
}
