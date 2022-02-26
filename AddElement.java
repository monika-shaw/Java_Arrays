package com.company;

import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {
        int[] a={1,2,4};
        int e=99;
        System.out.println("Old Array: "+Arrays.toString(a));
        int temp[]=new int[a.length+1];
        for (int i=0;i<a.length;i++)
            temp[i]=a[i];
        temp[a.length]=e;
        System.out.println(Arrays.toString(temp));



    }
}
