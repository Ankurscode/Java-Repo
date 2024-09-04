import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("The sum "+sum());
    }
    static int sum(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the first number ");
        int num1=in.nextInt();
        System.out.println("Enter the second number ");
        int num2= in.nextInt();
        int  sum=num1+num2;
        return sum;
    }
}