package com.Striver.Arrays;

import java.util.HashMap;
import java.util.Map;

public class P11_AppearOnce {
    public static void main(String[] args) {

        // Find the number that appears once, and the others twice.

        int[] arr={1,1,2,2,11,11,3,3,4,4,0};

//        System.out.println(appearOnceBruteForce(arr));
//        System.out.println(appearOnceBetter(arr));
//        System.out.println(appearOnceOptimal(arr));




        
    }

    static int appearOnceOptimal(int[] arr) {

        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor^=arr[i];
        }
        return xor;
    }

    static int appearOnceBetter(int[] arr) {

        Map<Integer,Integer> map=new HashMap<>();


        for(int i:arr){
            if(map.containsKey(i)) map.put(i,map.get(i)+1);
            else map.put(i,1);
        }

        for(var entry:map.entrySet()){
            if(entry.getValue()==1) return entry.getKey();
        }

        return -1;

    }

    private static int appearOnceBruteForce(int[] arr) {

        int n=arr.length;

        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(j!=i) {


                    if (arr[i] == arr[j]) {
                        count++;
                        break;
                    }
                }
            }
            if(count==0) return arr[i];

        }

        return -1;
    }
}
