package com.examp;

import java.util.Scanner;

public class calculator{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int ans=0 ;
        while(true){
            //taking operator from user
            System.out.println("Enter the operator");
            char op=in.next().trim().charAt(0);

            if(op=='+'||op=='-'||op=='*'||op=='/'){
                System.out.print("Enter the first number ");
                int num1=in.nextInt();
                System.out.print("Enter thr second number");
                int num2= in.nextInt();
                if(op=='+'){
                    ans=num1+num2 ;
                }
                if(op=='-'){
                    ans= num1-num2;
                }
                if(op=='*'){
                    ans=num1*num2 ;
                }
                if(op=='/'){
                    ans=num1/num2 ;
                }
                if(op=='%'){
                    ans=num1%num2 ;
                }

                else if (op=='x'||op=='X') {
                    break;
                }
                else {
                    System.out.println("Invalide optrator");
                }
                System.out.println(ans);

            }
        }
    }
}
