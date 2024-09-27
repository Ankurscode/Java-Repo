import java.util.Arrays;

public class Index {
    static void Select(int []arr){
        for (int i = 0; i < arr.length; i++) {
            //find the max item in the remaining arrays and swap it with correct index
            //last = n-i-1 where n=length of array
            int last=arr.length-i-1;
            int max=getMaxIndex(arr,0,last);
            swap(arr,max,last);
        }
    }
    static void swap(int[]arr,int first,int  second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static int getMaxIndex(int[] arr, int start, int end) {
        int max=start;
    for(int i=start;i<=end;i++){
        if(arr[max]<arr[i]){
            max=i;
        }
    }
        return max;
    }

    public static void main(String[] args) {
//        int []arr={11,5,6,3,2,8};
        int[]arr2={12,45,-66,78};
        Select(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
