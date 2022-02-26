package com.company;
import java.util.Arrays;
import java.util.Scanner;

 class Main
 {
     public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int[] a=new int[2];
        int[] b=new int[2];
        for (int i=0;i<a.length;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<b.length;i++)
            b[i]=sc.nextInt();
        int c[]=sum(a,b);
         for(int i=0;i<c.length;i++)
             System.out.println(c[i]);


     }

     public static int[] sum(int[] a,int[] b)
     {
         int[] c=new int[2];
         for(int i=0;i<c.length;i++)
             c[i]=a[i]+b[i];
         return c;
     }



 }











