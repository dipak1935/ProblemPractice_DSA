package com.Striver.Arrays;

import java.util.*;

public class P7_UnionOfTwoSortedArrays {
    public static void main(String[] args) {

        // Find the union of the given two arrays.

        int[] arr1={1,1,2,3,4,5,5,5,1,2,4,5,6,7,8,9,22,44};
        int[] arr2={1,2,3,4,5,6};

        System.out.println(Arrays.toString(unionArray(arr1,arr2)));
        System.out.println(Arrays.toString(unionArrayOptimal(arr1,arr2)));
    }

    static int[] unionArrayOptimal(int[] arr1, int[] arr2) {

        int n1=arr1.length;
        int n2=arr2.length;

        List<Integer> union=new ArrayList<>();

        int i=0,j=0;

        while(i<n1&&j<n2){
            if(arr1[i]<arr2[j]){
                if(!union.contains(arr1[i])){
                    union.add(arr1[i]);
                    if(i<n1-1) i++;
                }else{
                    if(i<n1-1) i++;
                }

            }
            if(arr1[j]<arr2[i]){
                if(!union.contains(arr1[j])){
                    union.add(arr1[j]);
                    if(j<n2-1) j++;
                }else{
                    if(i<n2-1) j++;
                }
            }

            if(arr1[i]==arr2[j]&&!union.contains(arr1[i])){
                union.add(arr1[i]);
                if(j<n2-1) j++;if(i<n1-1) i++;
            }
        }

        return arr1;

    }


    static int[] unionArray(int[] arr1, int[] arr2) {

        Set<Integer> st=new TreeSet<>();
        for(int i:arr1){
            st.add(i);
        }
        for(int i:arr2){
            st.add(i);
        }

        int[] union=new int[st.size()];
        int i=0;
        for(var ele:st){
            union[i]=ele;
            i++;
        }

        return union;



    }
}
