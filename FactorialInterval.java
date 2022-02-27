package com.company1;

public class FactorialInterval {
    public static void main(String[] args) {

        int n1=2;
        int n2=6;
        int f=1;
        int count=0;
        for(int i=n1;i<=n2;i++)
        {
            f=f*i;
            count++;
            System.out.println(f);
            System.out.println("count is"+count);
        }

    }
}
