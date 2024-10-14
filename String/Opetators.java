package String;

import java.util.ArrayList;

public class Opetators {
    public static void main(String[] args) {
        //It will give adition of ascii values of characers
        System.out.println('a'+'b');
        //It will add two string
        System.out.println("a"+"b");
        //It will add and give ascii value of the result output
        System.out.println('a'+3);
        //It will converted into bigger Integer which will call toString()
        // it is same as after few steps "a"+"1" 
        System.out.println("a"+1);
      
        
        System.out.println("a"+new ArrayList<>());

        System.out.println("Ankur"+new Integer(89));
        //here should be atleast one string
        System.out.println(new ArrayList<>()+""+new Integer(89));
        String c="a"+"b"; 
        System.out.println(c);
    }
    
}
