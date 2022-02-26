package com.company;

public class AverageArray {

    public static void main(String[] args) {

        int[] a=new int[4];
        a[0]=1;
        a[1]=2;
        a[2]=4;
        a[3]=9;
        int avg=0;
        int sum=0;
        for(int i=0;i<a.length;i++)
            sum=sum+a[i];
        avg=sum/a.length;
        System.out.println(avg);
    }
}
