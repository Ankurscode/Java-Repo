package swi.com;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int a=1;
        int sum=0;
        while (a!=0){
            a= in.nextInt();
            sum+=a;
        }
        System.out.println(sum);
    }
}
