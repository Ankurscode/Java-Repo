package Sorting;

import java.util.Arrays;

public class FirstSorting {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void BubbleSort(int[]arr){
        boolean swapped;
        //run the step n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped=false;
        //for each  step,max item will come at the last respective index
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }

            }

            //if it does not swap the break the program
            if(!swapped){
                break;
            }
        }
    }
}
