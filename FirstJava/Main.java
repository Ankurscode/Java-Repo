package com.ankur;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of Radius");
        int radius = input.nextInt();
        float PI=3.14f;
         float Area= PI*(radius*radius);
        System.out.println("Area of the circle is "+Area);

    }
}