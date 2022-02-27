package com.company1;

import java.util.Arrays;

public class Str {
    public static void main(String[] args) {
        String[] str={"a","bcc","a","dcf"};
        Arrays.sort(str);
        int j=0;
        int l=str.length-1;
        for (int i=0;i<l;i++)
        {
            if(str[i]!=str[i+1])
            {
                str[j++]=str[i];
            }
        }
        if(str[j]!=str[l])
        {
            str[j++]=str[l];
        }





    }
}
