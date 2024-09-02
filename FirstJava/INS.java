package swi.com;

import java.sql.SQLOutput;
import java.util.Scanner;

public class INS {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=1;
        int  sum=0;
        while(a!=0){
            a=in.nextInt();
            sum=sum+a;

        }
        System.out.println(sum);
    }
}
