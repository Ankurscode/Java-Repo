package com.ankur;

import java.util.Scanner;

public class fabric {
    public static void main(String[] args) {
  Scanner input=new Scanner(System.in);
        System.out.println("Enter your number" );
    int n=input.nextInt();

        int a=0;
        int b=1;
        System.out.println(a+" ");
        System.out.println(b+" ");
        for(int i=1;i<=n;i++){
            int sum=a+b;
            System.out.println(sum+ "");
            a=b;
            b=sum;

        }
    }
}
