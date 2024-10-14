package String;

public class Palindrom {
    public static void main(String[] args) {
        String name="ABCDCBA";
        boolean result=palin(name);
        System.out.println("the palindram is "+result);
        
    }
    public static boolean palin(String str){
        str=str.toLowerCase();
        for(int i=0;i<str.length()/2;i++){
             char start=str.charAt(i);
             char end=str.charAt(str.length()-1-i);
             if(start!=end){
                return false;
             }


        }
        return true;
    }
}
