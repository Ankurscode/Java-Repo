package swi.com;

import java.util.Scanner;

public class factorial {
//    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        System.out.println("Enter the number n ");
//        int n= in.nextInt();
//        int f=1;
//        for (int i=1;i<=n;i++){
//            f=f*i;
//
//        }
//        System.out.println("The factorial of "+n+ "is"+f);
//    }

    public static void main(String[] args) {
        int diff = subtractProductAndSum(234);
        System.out.println(diff);
    }

    public static int subtractProductAndSum(int n) {
        int sum=0;
        int pro=1;
        while(n != 0){
            n %= 10;
            System.out.println(n);
        }

        return (sum - pro);

    }
}
