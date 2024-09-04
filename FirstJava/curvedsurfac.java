package com.ankur;

import java.util.Scanner;

public class curvedsurfac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of Radius: ");
        int r=input.nextInt();
        System.out.print("Enter the value of height: ");
        int h=input.nextInt();
        float pi=3.14f;
        float Area = 2*pi*r*h;
        System.out.println("Area of the curved surfac is: "+Area);
    }
}
