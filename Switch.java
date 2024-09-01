package swi.com;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the your day");
//        String fruit = in.next();
//       switch(fruit){
//           case "Mango" -> System.out.println("King of the fruit");
//           case "Water mallon" -> System.out.println("Very jusit");
//           case "Honey" -> System.out.println("Mad honey type");
//           case "Weed" -> System.out.println("Not good for health");
//
//
//       }
        int day=in.nextInt();
        switch (day){
            case 1 ->{
                System.out.println("Sunday");
                System.out.println("Its a weekday");
            }
            case 2->{
                System.out.println("Monday");
                System.out.println("Its a weekday");
            }
            case 3 ->{
                System.out.println("Tuesday");
                System.out.println("Its a weekday");
            }
            case 4->{
                System.out.println("Wednesday");
                System.out.println("Its a weekday");
            }
            case 5 ->{
                System.out.println("Thursday");
                System.out.println("Its a weekday");
            }
            case 6 ->{
                System.out.println("Friday");
                System.out.println("Its a weekend");
            }
            case 7 ->{
                System.out.println("Saturday");
                System.out.println("Its a weekend");
            }

        }

    }
}
