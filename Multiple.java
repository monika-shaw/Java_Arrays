package com.company;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=20;
        int x=3;
        int y=5;
        int sum=0;

            for (int i = 3; i <= n; i++) {
                if((i%x ==0)||(i%y==0))
                {
                  sum = sum + i;
               }
            }
        System.out.println(sum);
    }
}
