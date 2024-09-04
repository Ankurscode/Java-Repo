import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your age");
        int age= in.nextInt();
        if(Iselegiable(age)){
            System.out.println("You are elegiable for voting");
        }
        else {
            System.out.println("You are not elegiable for voting");
        }


    }
    static boolean Iselegiable(int age){
        return age>18;
    }
}