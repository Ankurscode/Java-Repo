package com.Om;


import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        //we will put  integer value in it then it will provide float value
//        //This automatic conversion is called Typpe conversion
//        System.out.println(num);

        //Type Casting
        // In types casting we can convert the bigger value into small
        //it will only show the inter value if we will put float value
        int sum=(int)(65.5);
        System.out.println(sum);
    }
}
