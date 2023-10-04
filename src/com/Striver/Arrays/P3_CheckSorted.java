package com.Striver.Arrays;

public class P3_CheckSorted {
    public static void main(String[] args) {

        // Check if the given array is sorted.

        int[] arr={1,2,2,3,3,4,7,5};

        System.out.println(checkSorted(arr));
    }
    static boolean checkSorted(int[] arr){

        int n=arr.length;

        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]) return false;
        }

        return true;
    }
}
