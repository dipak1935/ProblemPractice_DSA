package com.Striver.Arrays;

public class P10_MaxConsecutiveOnes {
    public static void main(String[] args) {

        // Return the maximum consecutive ones in the given array.

        int[] arr={1,1,0,1,1,1,0,1,1};

        System.out.println(maxOnes(arr));
        System.out.println(maxOnesBetter(arr));

    }

    private static int maxOnesBetter(int[] arr) {

        int n=arr.length,curSum=0,maxSum=0;

        for(int i=0;i<n;i++){
            if(arr[i]==1){
                curSum+=arr[i];
            }
            else{
                maxSum=Math.max(maxSum,curSum);
                curSum=0;
            }
        }

        return maxSum;
    }

    static int maxOnes(int[] arr) {

        int n=arr.length;

        int maxCount=0;

        for(int i=0;i<n;i++){
            int curCount=0;
            for(int j=i;j<n;j++){
                if(arr[j]==1){
                    curCount++;
                }
                else break;
            }
            maxCount=Math.max(curCount,maxCount);
        }

        return maxCount;
    }
}
