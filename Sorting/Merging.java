package Sorting;

import java.util.Arrays;

public class Merging {
    public static void main(String[] args) {
        int []arr1={1,2,3,0,0,0};
        int []arr2={2,5,6};
        int m=3;
        int n=3;
        mearg(arr1,m,arr2,n);
        System.out.println(Arrays.toString(arr1));
    }

    static void mearg(int[]arr1,int m,int[]arr2,int n){
        int mInx=m-1;
        int nInx=n-1;
        int last=m+n-1;
        while(nInx>=0){
            if(mInx>0 && arr1[mInx]>arr2[nInx]){
                arr1[last]=arr1[mInx];
                mInx--;
            }
            else {
                arr1[last]=arr2[nInx];
                nInx--;
            }
            last--;
        }
    }
}
