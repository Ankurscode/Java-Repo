import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun(1,2,3,56,5,4,3,568,90,8);

        multie(20,40,"Ankur" , "Kiran" , "Ayushma","Lisha","Lipashana");

    }
    static void multie(int a,int b,String ...v){

    }
    static void fun(int ...v)//if we don't know how many inputs we are taking that y  we use (datatypes ...v)
    {
        System.out.println(Arrays.toString(v));//we will call v in it.
    }
}
