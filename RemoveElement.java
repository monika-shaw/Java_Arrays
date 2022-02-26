package com.company;


import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
       int[] a={6,7,4,2};
       int index=1;
//       int temp[]=new int[a.length-1];
//       System.arraycopy(a,0,temp,0,index);
//        System.out.println(Arrays.toString(temp));
//        System.arraycopy(a,index+1,temp,index,a.length-index-1);

        if(a==null||index<0||index>=a.length)
            System.out.println("Invalid");
        int temp[]=new int[a.length-1];
        for (int i=0,j=0;i<a.length;i++) {
            if (i == index) {
                continue;
            }
            temp[j++] = a[i];
        }
        System.out.println(Arrays.toString(temp));





    }

}
