import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        boolean ans=IsPrime(n);
        System.out.println(ans);
    }
    static boolean IsPrime(int n){
        if(n<=1){
            return false ;
        }
        int c=2;
        while(c*c<=n) {
            if (c % n == 0) {
                return false;
            }
            c++;
            return c * c > n;
        }

        return false;
    }
}
