package com.AdityaVerma.SlidingWindow;

public class Basics {
    public static void main(String[] args) {

        //Return the subarray with maximum sum of size k.

        int[] arr={2,3,5,2,9};
        int k=3;

        System.out.println(maxSumBruteForce(arr,k));

    }

    static int maxSumBruteForce(int[] arr, int k) {

        int n=arr.length,maxSum=0;

        for(int i=0;i<n-2;i++){
            int curSum=0;
            for(int j=i;j<i+3;j++){
                curSum+=arr[j];
            }
            maxSum=Math.max(curSum,maxSum);
        }

        return maxSum;

    }
}
