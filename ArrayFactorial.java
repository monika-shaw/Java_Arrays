package com.company1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFactorial {
    public static void main(String[] args) {
//        int[] a={1,2,3,4,5};
//        int f=1;
//        int count=0;
//        for(int i=0;i<a.length;i++)
//        {
//            f=f*a[i];
//            System.out.println(f);
//            count++;
//        }
//        System.out.println(count);

        int[] a={2,3,4,5};


        int f[]=fact(a);
        int b[]=new int[f.length-1];
        for(int i=0;i<f.length-1;i++)
            b[i]=f[i];
        System.out.println(Arrays.toString(b));
        System.out.println("count is"+f[4]);

    }


    public static int[] fact(int[] arr)
    {
        int[] f=new int[arr.length+1];
        f[4]=0;
        int fa=1;
        for(int i=0;i< arr.length;i++)
        {

                fa = fa * arr[i];
                f[i] = fa;
                f[4]++;

        }

        return f;


    }


}
