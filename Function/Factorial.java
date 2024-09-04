package Ankur.com;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int fact= in.nextInt();
        int result=Isfactorial(fact);
        System.out.println("Your factorial is"+result);
    }
    static int Isfactorial(int n){
        if(n<0){
            return 0;
        }
        int resullt=1;
        for (int i=1;i<=n;i++){
            resullt =resullt*i;
        }
        return resullt;
    }

}
