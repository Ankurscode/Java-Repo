package com.ankur;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=0;
        int b=1;
        for(int i=0;i<=50;i++){
            int sum=a+b;
            a=b;
            b=sum;
        }
    }
}
