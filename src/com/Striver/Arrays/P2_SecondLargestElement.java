package com.Striver.Arrays;

import java.util.Arrays;

public class P2_SecondLargestElement {
    public static void main(String[] args) {

        int[] arr={1,2,4,7,7,5};

        System.out.println(secondLargestElementBruteForce(arr));
        System.out.println(secondLargestElementOptimal(arr));
        System.out.println(secondLargestElementBetter(arr));
    }

    static int secondLargestElementOptimal(int[] arr) {

        int n=arr.length;
        int largest=arr[0],secondLargest=-1;

        for(int i=0;i<n;i++){

            if(arr[i]>largest){
                int temp=largest;
                largest=arr[i];
                secondLargest=temp;
            }

        }
        return secondLargest;
    }

    private static int secondLargestElementBetter(int[] arr) {

        int n=arr.length,largest=arr[0];

        for(int i=0;i<n;i++){

            if(arr[i]>largest) largest=arr[i];

        }

        int secondLargest=-1;

        for(int i=0;i<n;i++){
            if(arr[i]>secondLargest&&arr[i]<largest) secondLargest=arr[i];
        }
        return secondLargest;

    }

    static int secondLargestElementBruteForce(int[] arr) {

        Arrays.sort(arr);

        int n=arr.length;
        int largest=arr[n-1];
        int secondLargest=arr[0];

        for(int i=n-1;i>=0;i--){

            if(arr[i]!=largest){
                secondLargest=arr[i];
                return secondLargest;
            }
        }

        return secondLargest;
    }
}
