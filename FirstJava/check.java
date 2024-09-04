package com.ankur;

import java.util.Scanner;

public class check {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your character ");
        char ch= in.next().trim().charAt(0);
        if (ch>='A' && ch<='Z'){
            System.out.println(ch+" is upper case letter");
        }
        else {
            System.out.println(ch+" is lower case letter");
        }
    }
}
