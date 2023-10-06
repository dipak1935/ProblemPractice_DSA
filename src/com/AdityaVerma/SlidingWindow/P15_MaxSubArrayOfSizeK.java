package com.AdityaVerma.SlidingWindow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class P15_MaxSubArrayOfSizeK {
    public static void main(String[] args) {

        // Return the maximum int in subarray of size k.

        int[] arr={1,3,-1,-3,5,3,6,7};
        int k=2;


        maximumSubarrayBruteForce(arr,k);
        System.out.println();
        System.out.println();
        maximumSubarrayOptimal(arr,k);

    }

    static void maximumSubarrayOptimal(int[] arr, int k) {

        int n=arr.length;
        int i=0,j=0;

        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());


        while(j<n){

            q.add(arr[j]);

            if(j-i+1<k) j++;
            else if(j-i+1==k){
                System.out.println(q.peek());

               q.remove(arr[i]);


               i++;
               j++;
            }

        }


    }

    static void maximumSubarrayBruteForce(int[] arr, int k) {

        int n=arr.length;

        for(int i=0;i<n-k+1;i++){
            int max=Integer.MIN_VALUE;
            for(int j=i;j<i+k;j++){

                max=Math.max(max,arr[j]);
            }
            System.out.println(max);
        }
    }
}
