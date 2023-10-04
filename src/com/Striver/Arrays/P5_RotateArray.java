package com.Striver.Arrays;

import java.util.Arrays;

public class P5_RotateArray {
    public static void main(String[] args) {

        //Left rotate the array by one place.

        int[] arr={1,2,3,4,5,6,7};
        int k=1;
        //Output: 2,3,4,5,1

        System.out.println(Arrays.toString(rotateArrayBruteForce(arr,k)));
        System.out.println(Arrays.toString(rotateArrayBetter(arr,k)));
        System.out.println(Arrays.toString(rotateArrayOptimal(arr,k)));

        
    }
    static int[] rotateArrayOptimal(int[] arr,int k){

        int n=arr.length;

        k=k%n;

        reverseArray(arr,0,k-1);
        reverseArray(arr,k,n-1);
        reverseArray(arr,0,n-1);

        return arr;

    }
    static void reverseArray(int[] arr,int start,int end){


        while(start<=end){

            int temp=arr[start];

            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
    }
    static int[] rotateArrayBetter(int[] arr,int k){

        int n=arr.length;
        int[] temp=new int[k];

        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }

        for(int i=k;i<n;i++){

            arr[i-k]=arr[i];
        }

        int j=0;
        for(int i=n-k;i<n;i++){
            arr[i]=temp[j++];
        }

        return arr;
    }

    private static int[] rotateArrayBruteForce(int[] arr,int k) {

        int n=arr.length;
        int[] ans=new int[n];

        int j=0;
        for(int i=k;i<n;i++){

            ans[j++]=arr[i];
        }
        for(int i=0;i<k;i++){
            ans[j++]=arr[i];
        }

        return ans;

    }
}
