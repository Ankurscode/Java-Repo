package com.ankur;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of the triangle: ");
        int h=input.nextInt();
        System.out.print("Enter the base of the triangle: ");
        int b=input.nextInt();
        int Area=h*b/2;
        System.out.println("The area of the triangle is "+Area);
    }
}
