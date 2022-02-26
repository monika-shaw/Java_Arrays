package com.company;
        import java.lang.*;
        import java.util.Scanner;

public class PerfectCube
        {
            static int countCubes(int a, int b)
            {
                int cnt = 0;


                for (int i = a; i <= b; i++)


                    for (int j = 1; j * j * j <= i; j++)
                        if (j * j * j == i)
                            cnt++;

                return cnt;
            }


            public static void main(String[] args)
            {
               Scanner sc=new Scanner(System.in);
               int a=sc.nextInt();
                int b=sc.nextInt();

                System.out.print("Count of Cubes is "
                        + countCubes(a, b));
            }
        }


