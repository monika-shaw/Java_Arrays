package com.company1;

public class EvenOddInterval {
    public static void main(String[] args) {
        int n1=2;
        int n2=6;
        int count=0;
        for(int i=n1;i<=n2;i++)
        {
            if(i%2==0)
            {
                count++;
                System.out.println("Even number"+i+ "count is"+count);
            }
        }
    }
}
