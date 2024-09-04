import java.util.Scanner;

public class Suming {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int num1= in.nextInt();
        System.out.println("Enter your second nummber: ");
        int num2= in.nextInt();
        int sum=sum(num1,num2);
        System.out.println("Your sum is "+sum);
    }
    static int sum(int num1,int num2){
        return num1+num2;
    }
}
