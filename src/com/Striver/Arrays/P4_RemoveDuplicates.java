package com.Striver.Arrays;

import java.util.*;

public class P4_RemoveDuplicates {
    public static void main(String[] args) {

        // Remove duplicates from a sorted array.

        int[] arr={1,2,2,2,3,3};

        System.out.println(Arrays.toString(removeDuplicatesBruteForce(arr)));


        System.out.println(Arrays.toString(removeDuplicatesOptimal(arr)));



    }
    static int[] removeDuplicatesBruteForce(int[] arr) {

        Set<Integer> st=new LinkedHashSet<>();

        for(int i: arr){
            st.add(i);
        }

        int i=0;
        for(var ele:st){

            arr[i++]=ele;
        }

        return arr;


    }

    static int[] removeDuplicatesOptimal(int[] arr) {

        int n=arr.length,k=0;
        for(int i=1;i<n;i++){

            if(arr[i]!=arr[k]){
                arr[++k]=arr[i];
            }
        }

        return arr;
    }
}
