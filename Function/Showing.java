public class Showing {
    static int x=90;//this will be showed in line 7
    public static void main(String[] args) {

       // int x;
       // System.out.println(x);//scope will begine after initialise
        // x=40;
        System.out.println(x);
        fun();
       // int x=40;//shadowing x which is initialised at the top which is at first block
        //since this is only initialied in this block the fun() funcition will return 90 of top
        System.out.println(x);
        camp();
    }
    static void fun(){
        System.out.println(x);
    }
    static void camp(){
        System.out.println(x);
    }
}
