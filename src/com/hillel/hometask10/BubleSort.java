package com.hillel.hometask10;

import com.hillel.helper.MyHelper;

public class BubleSort {
    public  static void bubleSort(int[] a) {

        for (int i = a.length; i > 0; i--) {
            for (int n = 1 ; n < i; n++) {
                if (a[n] < a[n-1]) {

                    MyHelper.swap(a,n,n-1);
                }
            }
        }
    }

}
