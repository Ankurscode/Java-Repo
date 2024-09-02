import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("If the answer is true then it even elese it is odd ");
        System.out.println("Enter thhe value of n");
        int n= in.nextInt();
        boolean ans=even(n);

        System.out.println(ans);
    }
    static boolean even(int n){
        int c=2;
        if(n%2==0){
            return true;
        }
        return false;
    }
}
