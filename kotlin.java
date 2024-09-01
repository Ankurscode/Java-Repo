package swi.com;

import java.util.Scanner;

public class kotlin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
     int max=Integer.MIN_VALUE;
     int number;
        System.out.print("Enter the row of number");
     while (true){

         number= in.nextInt();
         if(number==0) {
             break;
         }
         if(number>max){
             max=number;
         }

     }
        System.out.println("Your maximum number is"+max);

    }
}
