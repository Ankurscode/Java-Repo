import java.util.Arrays;

public class changes {
    public static void main(String[] args) {
        int[]arr={1,5,6,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void  change(int[]num){
        num[0]=99;
    }
}
