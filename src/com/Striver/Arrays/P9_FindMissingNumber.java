package com.Striver.Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class P9_FindMissingNumber {
    public static void main(String[] args) {

//        Given an array nums containing n distinct numbers in the range [0, n],
//        return the only number in the range that is missing from the array.

        int[] arr={3,1,0,2,4};
        int n=5;

        System.out.println(findMissingBruteForce(arr,n));
        System.out.println(findMissingOptimal1(arr,n));
        System.out.println(findMissingOptimal2(arr,n));
        System.out.println(findMissingBetter(arr,n));

    }

    private static int findMissingBetter(int[] arr, int n) {

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<=n;i++){
            map.put(i,1);
        }
        for(int i=0;i<n;i++){
            map.put(arr[i],0);
        }

        for(var entry:map.entrySet()){
            if(entry.getValue()==1) return entry.getKey();
        }

        return -1;
    }

    static int findMissingOptimal2(int[] arr, int n) {

        int xor1=0;
        for(int i=0;i<=n;i++){
            xor1^=i;
        }
        int xor2=0;
        for(int i=0;i<n;i++){
            xor2^=arr[i];
        }
        return xor1^xor2;


    }
    static int findMissingOptimal1(int[] arr, int n) {


        int actSum=0;
        for(int i=0;i<n;i++){
            actSum+=arr[i];
        }
        return n*(n+1)/2 - actSum;

    }

    static int findMissingBruteForce(int[] arr, int n) {

       for(int i=0;i<=n;i++){
           int count=0;
           for(int j=0;j<n;j++){
               if(arr[j]==i){
                   count++;
                   break;
               }
           }
           if(count==0) return i;
       }

       return -1;

    }
}
