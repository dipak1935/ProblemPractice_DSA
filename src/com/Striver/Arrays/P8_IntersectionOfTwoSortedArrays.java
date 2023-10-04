package com.Striver.Arrays;

import java.util.*;

public class P8_IntersectionOfTwoSortedArrays {
    public static void main(String[] args) {

        // Return the intersection list of two sorted arrays.

        int[] a={1,2,2,3,4,5,6};
        int[] b={2,3,3,5,6,6,7};

        System.out.println(intersectionList(a,b));

    }
    

    private static List<Integer> intersectionList(int[] a, int[] b) {

        Map<Integer,Integer> map=new TreeMap<>();
        List<Integer> inter=new ArrayList<>();

        for(int i:a){
            map.put(i,1);
        }
        for(int i:b){
            if(map.containsKey(i)) map.put(i,2);
        }

        for(var key:map.entrySet()){
            if(key.getValue()==2) inter.add(key.getKey());
        }

        return inter;

    }
}
