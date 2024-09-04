package Ankur.com;

import java.util.Scanner;

public class Mark {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your number ");
        int number= in.nextInt();
        String grade=marks(number);
        System.out.println("Your grade is "+grade);


    }
   static String marks(int number) {
        if(number>91 && number<100){
            return "AA";
        }
        else if (number>81 && number<90) {
            return "AB";
        }
        else if (number>71 && number<80) {
            return "BB";
        } else if (number>61 && number<70) {
            return "BC";
        } else if (number>51 && number<60) {
            return "CC";
        } else if (number>41 && number<50) {
            return "DD";
        }
        else {
            return "fail";
        }


   }
}
