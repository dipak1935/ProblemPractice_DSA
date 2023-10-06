package com.AdityaVerma.SlidingWindow;

import java.util.*;

public class P13_FirstNegativeInt {
    public static void main(String[] args) {

        // Find the first negative integer in every window of size K.

        int[] arr={12,-1,-7,8,-15,30,16,28};
        int k=3;

        firstNegativeBruteForce(arr,k);
        firstNegativeOptimal(arr,k);

    }
    static void firstNegativeOptimal(int[] arr, int k) {

        int n=arr.length,i=0,j=0;

        List<Integer> st=new ArrayList<>();

        while(j<n){
            if(arr[j]<0) st.add(arr[j]);

            if(j-i+1<k) j++;
            else if(j-i+1==k){

                if(st.isEmpty()) System.out.println(0);
                else {
                    System.out.println( st.get(0));

                   if(arr[i]==st.get(0)) st.remove(0);
                }

                j++;
                i++;
            }
        }
    }

    static void firstNegativeBruteForce(int[] arr, int k) {

        int n=arr.length;

        for(int i=0;i<n-k+1;i++){
            boolean flag=false;
            for(int j=i;j<i+k;j++){
                if(arr[j]<0){
                    System.out.println(arr[j]);
                    flag=true;
                    break;
                }
            }
            if(flag==false) System.out.println(0);
        }
    }
}
