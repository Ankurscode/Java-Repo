public class Scoop {
    public static void main(String[] args) {
       int a=10;
       int b=20;
       String name="Ankur";
        {
//            int a=30;//it is not valid because it is already initialised
            int c=89;
            System.out.println(c);
            name="Kunal";
            System.out.println(name);
        }
        System.out.println(name);//it is valid because it has already initialised  and  inside the block only modification is done
//        System.out.println(c); it is not valid because it is initialised in side the block element

        //loop scope
//        for (int i=0;i<4;i++){
//            int num=90;
//            a=9000;
//        }
//        System.out.println(a);

    }


//    static void swap(int num1,int num2){
//        int temp=num1;
//        num1=num2;
//        num2=temp;
//        //this change can only be vlaid in this funtion or method;
//        //this is called scoping
//    }
}
