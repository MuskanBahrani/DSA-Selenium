package org.example;

public class Test1 {


    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void moveAllZeroes(int[] arr){

        int zeroIndex = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                swap(arr,i,zeroIndex);
                zeroIndex++;
            }
        }
    }

    public static void main(String[] args) {
        //int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        int[] arr = {0,0,0,0,0};
        moveAllZeroes(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
