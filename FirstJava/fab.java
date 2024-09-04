package com.ankur;

import java.util.Scanner;

public class fab {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the vlaue of n");
        int n=in.nextInt();
        int p=0;
        int ne=1;
        for(int i=1;i<=n;i++){
            int sum=p+ne;
            p=ne;
            ne=sum;
            System.out.println(ne);
        }
    }
}