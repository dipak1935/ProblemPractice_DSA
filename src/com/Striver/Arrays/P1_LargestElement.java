package com.Striver.Arrays;

import java.util.Arrays;

public class P1_LargestElement {
    public static void main(String[] args) {

      int[] arr={3,2,1,5,2};

        System.out.println(largestElementOptimal(arr));
        System.out.println(largestElementBruteForce(arr));

    }
    static int largestElementBruteForce(int[] arr){

        Arrays.sort(arr);

        return arr[arr.length-1];
    }
    static int largestElementOptimal(int[] arr) {

        int max=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }

        return max;
    }
}
