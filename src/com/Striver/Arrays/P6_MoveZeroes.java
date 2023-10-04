package com.Striver.Arrays;

import java.util.Arrays;

public class P6_MoveZeroes {
    public static void main(String[] args) {
        // move all zeroes to the end of the array.

       // int[] arr={0,0,1,0,2,3,2,0,0,0,0,4,5,1};
       // int[] arr={2,1};
       int[] arr={4,2,4,0,0,3,0,5,1,0};

        System.out.println(Arrays.toString(moveZeroesOptimal1(arr)));
        System.out.println(Arrays.toString(moveZeroesOptimal2(arr)));
        System.out.println(Arrays.toString(moveZeroesOptimal3(arr)));
    }
    static int[] moveZeroesOptimal3(int[] arr){

        int n=arr.length;

        int j=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1) return arr;


        for(int i=j+1;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        return arr;
    }
    static int[] moveZeroesOptimal2(int[] arr){



        int n=arr.length;
        int j=0;

        for(int i=0;i<n;i++){

            if(arr[i]!=0) arr[j++]=arr[i];
        }
        for(;j<n;j++){
            arr[j]=0;
        }

        return arr;
    }
    static int[] moveZeroesOptimal1(int[] arr){

        // Relative order of elements will not be maintained.

        int n=arr.length;
        int left=0,right=n-1;

        while(left<right){
            if(arr[left]==0&&arr[right]!=0){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
            if(arr[left]!=0) left++;
            if(arr[right]==0) right--;

        }

        return arr;
    }

    private static int[] moveZeroesBruteForce(int[] arr) {

        int n=arr.length;
        int[] ans=new int[n];

        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0) ans[j++]=arr[i];
        }

        return ans;
    }
}
