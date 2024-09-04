package com.ankur;

import java.util.Scanner;

public class maximum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = input.nextInt();
        System.out.println("Enter the value of b");
        int b = input.nextInt();
        System.out.println("Eneter the value of c");
        int c = input.nextInt();
        int max;
        max = a;
        if(b>max){
            max=b;
            System.out.println("Maximum number is "+max);
        }
        else if(c>max){
            max=c;
            System.out.println("Maximum number is "+max);
        }
        else {
            System.out.println("Maximum number is "+max);
        }

    }
}
