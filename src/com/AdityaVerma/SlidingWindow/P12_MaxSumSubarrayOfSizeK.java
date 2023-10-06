package com.AdityaVerma.SlidingWindow;

public class P12_MaxSumSubarrayOfSizeK {
    public static void main(String[] args) {

        //Return the subarray with maximum sum of size k.

        int[] arr={2,5,1,8,2,9,1};
        int k=3;

        System.out.println(maxSumBruteForce(arr,k));
        System.out.println(maxSumOptimal2(arr,k));


    }
    static int maxSumOptimal2(int[] arr,int k) {

        int n = arr.length;
        int i = 0,j=0, maxSum = 0, curSum = 0;

        while (j < n) {

            curSum+=arr[j];

            if(j-i+1<k) j++;
            else if(j-i+1==k){
                maxSum=Math.max(curSum,maxSum);
                curSum-=arr[i];
                j++;
                i++;
            }
        }
        return maxSum;
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
    static int maxSumOptimal1(int[] arr,int k){

        int n=arr.length;
        int i=0,maxSum=0,curSum=0;

        for(int j=0;j<n;j++){
            if(j-i+1==k){
                curSum+=arr[j];

                maxSum=Math.max(maxSum,curSum);

                curSum-=arr[i];
                i++;
            }
            else{
                curSum+=arr[j];
            }
        }

        return maxSum;

    }
}
