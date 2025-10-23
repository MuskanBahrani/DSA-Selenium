package org.example;

public class Example3 {


//    public static int MaximumSubArraySum(int[] arr){
//
//        int maxSum = Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++){
//            int currSum = arr[i];
//            for(int j=i+1;j<arr.length;j++){
//                currSum += arr[j];
//                maxSum = Math.max(currSum,maxSum);
//
//            }
//        }
//
//        return maxSum;
//
//    }


public static int kadaneAlgo(int[] arr){

    int maxSum = arr[0];
    int currSum = arr[0];

    for(int i=1;i<arr.length;i++){

        currSum = Math.max(arr[i], currSum+arr[i]);
        maxSum = Math.max(maxSum,currSum);
    }

    return maxSum;
}

    public static void main(String[] args) {

        int ans = kadaneAlgo(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        System.out.println(ans);
    }
}
