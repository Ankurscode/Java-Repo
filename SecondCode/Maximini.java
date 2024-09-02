import java.util.Scanner;

public class Maximini {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the first value");
        int First= in.nextInt();
        System.out.println("Enter the second value");
        int Second= in.nextInt();
        System.out.println("Enter the Third value");
        int Third= in.nextInt();
        int larg=larger(First,Second,Third);
        System.out.println("Among this three number"+larg+"is maximum");
        int mini=smaller(First,Second,Third);
        System.out.println("Among thid three number"+mini+"is minimum");
    }
    static int larger(int first,int second,int third){
        int max=first;
        if(second>max){
            max=second;
        }
        if(third>max){
           max=third;
        }
        return max;
    }
    static int smaller(int first,int second,int third){
        int min=first;
        if(second<min){
         min=second;
        }
        if (third<min){
          min=third;

        }
        return min;
    }
}
