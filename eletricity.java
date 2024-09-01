package swi.com;

import java.util.Scanner;

public class eletricity {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the units used :");
        float unit= in.nextFloat();
        float bill;
       if(unit <100){
           bill=(float)(unit*2.13);
           System.out.println("Your bill is "+bill);
       }
        else if(unit >100){
            bill=(float)(unit*4.23);
            System.out.println("Your bill is "+bill);
        } else if (unit >500) {
           bill=(float)(unit*4.10);
           System.out.println("Your bill is "+bill);
       }
    }
    }

