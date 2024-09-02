public class Overloading {
    public static void main(String[] args) {
//        fun(89);
//        fun("Ankur");
//        fun(68,65);
//        fun(54);
      int ans=sum(20 ,4);
        System.out.println(ans);

    }
    //In this function name can be same but parameter must be different
//    static void fun(int a)
//    {
//        System.out.println(a);
//    }
//    static void fun(String name)
//    {
//        System.out.println(name);
//    }
    // both the function have same parameter but different value
//    static void fun(int a)
//   {
//        System.out.println(a);
//    }
//    static void fun(int b,int c){
//        System.out.println(b+" "+c);
//    }
    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }

}
