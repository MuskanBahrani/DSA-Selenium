package org.example;

public class Example1 {


    public static void swap(int[] arr, int firstIndex , int secondIndex){
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }


    public static void moveZeroesToEnd(int[] arr){

        int zeroIndex = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                swap(arr,zeroIndex,i);
                zeroIndex++;
            }

        }
    }


}
