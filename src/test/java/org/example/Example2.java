package org.example;

public class Example2 {

    public static int findMissingNumber(int[] arr){
         int n = arr.length;
         int expectedSum = n*(n+1)/2;

         int actualSum = 0;

         for(int i=0;i<n;i++){
             actualSum += arr[i];
         }

         return expectedSum-actualSum ;

    }

    public static void main(String[] args) {

        int[] arr = {1,0,3};

        int ans = findMissingNumber(arr);
        System.out.println(ans);


    }
}
