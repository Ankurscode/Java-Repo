package com.ankur;

import java.util.Scanner;

public class occuring {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=in.nextInt();
        System.out.print("Enter the number which has to be repeted : ");
        int p=in.nextInt();
        int count=0;
        while(n>0){
            int rem=n%10;
            if(rem==p){
                count ++;
            }
            n=n/10;
        }
        System.out.println("The given "+p+" is repeted "+count+" times");
    }
}
