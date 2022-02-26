package com.company;

import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
       int[] a={1,1,2,2,3};
      int j=0;
      int l=a.length-1;
      Arrays.sort(a);
      for(int i=0;i<l;i++)
      {
          if(a[i]!=a[i+1])
          {
              a[j++]=a[i];
          }
      }
      if(a[j]!=a[l])
          a[j++]=a[l];



       int[] b=Arrays.copyOf(a,j);
        System.out.println(Arrays.toString(b));

    }

}
