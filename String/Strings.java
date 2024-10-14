package String;

import java.util.Scanner;

public class Strings {
         public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // String name=sc.nextLine();
        // System.out.println("Your name is "+name);





        //Length in String

        // String firstname="Ankur";
        // String lastname="Yadav";
        // String fullname= firstname+" "+lastname;
        // System.out.println(fullname.length());
        // for (int i = 0; i < fullname.length(); i++) {
        //     System.out.println(fullname.charAt(i));



    //String pool and immulibility
                     String a="Ankur";
                         System.out.println(a);//Here "Ankur" object is created in heap inside pool
                    a="Yadav";// Here we created "yadav " now it will not change the String it will new objects in pool
                        System.out.println(a);
    
    }
}