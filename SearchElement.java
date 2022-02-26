package com.company;

import java.util.Arrays;

public class SearchElement {
    public static void main(String[] args) {
        int[] a={1,2,3};
        int e=6;
        for(int i=0;i<a.length;i++)
        {
            if(e==a[i])
            {
                System.out.println("Element Present"+e);
            }
            else
                System.out.println("Not Present"+e);
        }

    }
}
