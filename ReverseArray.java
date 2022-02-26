package com.company;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {
    public static void main(String[] args) {
//        int[] a = {1, 2, 3, 4, 7};
//
//
//        Collections.reverse(Arrays.asList(a));
//
//        System.out.println(Arrays.toString(a));
         int[] a={1,2,7};
         for (int i=0;i<a.length;i++)
             System.out.println(a[i]);
         for (int i=a.length-1;i>=0;i--)
             System.out.println(a[i]);

    }
}
