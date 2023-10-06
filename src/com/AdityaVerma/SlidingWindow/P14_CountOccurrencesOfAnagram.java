package com.AdityaVerma.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class P14_CountOccurrencesOfAnagram {
    public static void main(String[] args) {

        // Count the occurrences of a anagram of string2 in string1.

        String s1="aabaabaa";
        String s2="aaba";

        System.out.println(countAnagrams(s1,s2));
    }

    private static int countAnagrams(String s1, String s2) {

        int n=s1.length();
        int k=s2.length();

        Map<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<k;i++){
            char key=s2.charAt(i);
            if(map2.containsKey(key)) map2.put(key, map2.get(key)+1);
            else map2.put(key,1);
        }

        int i=0,j=0,count=0;

        Map<Character,Integer> map1=new HashMap<>();

        while(j<n){
            char insert_key=s1.charAt(j);
           if(!map1.containsKey(insert_key)) map1.put(insert_key,1);
           else map1.put(insert_key,map1.get(insert_key)+1);

           if(j-i+1<k) j++;

           else if(j-i+1==k){

               if(map1.equals(map2)) count++;

               char remove_key=s1.charAt(i);
               if(map1.get(remove_key)==1) map1.remove(remove_key);
               else if(map1.get(remove_key)>1) map1.put(remove_key,map1.get(remove_key)-1);

               j++;
               i++;
           }
        }

        return count;
    }
}
