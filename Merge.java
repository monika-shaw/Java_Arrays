package com.company;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
//        int[] a={1,2,3};
//        int[] b={4,5,6};
//        int[]c=new int[a.length+b.length];
//
//        for (int i=0;i<a.length;i++)
//            c[i]=a[i];
//        for (int i=0,j=a.length;j<(a.length+b.length);i++,j++)
//            c[j]=b[i];
//        System.out.println(Arrays.toString(c));

        int[] a={1,6,3};
        int[] b={4,5,2};
        int[] c=new int[a.length+b.length];

        System.arraycopy(a,0,c,0,a.length);

        System.arraycopy(b,0,c,a.length,b.length);
         Arrays.sort(c);
        System.out.println(Arrays.toString(c));
    }


}
