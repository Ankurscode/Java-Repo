import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
    String presonal=greet("Ankur");
        System.out.println(presonal);
}

static String greet(String name){
        Scanner in =new Scanner(System.in);
    System.out.println("Enter your way of greeting ");
    String greet= in.next() +name;
    return greet;
}
//    static String greet(){
//        Scanner in=new Scanner(System.in);
//        System.out.println("Enter your way of greeting ");
//        String greet= in.next();
//        return greet;
//    }
}
