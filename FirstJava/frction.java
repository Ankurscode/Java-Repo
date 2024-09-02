package swi.com;

import java.util.Scanner;

public class frction {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number");
        int num=in.nextInt();
      for (int i=1 ; i<=num;i++){
          if(num%i==0){
              System.out.println(i+"is factorial ");

          }
      }
    }
}
