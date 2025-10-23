package org.example;

import java.util.HashMap;
import java.util.Map;

public class Example5 {


    public static void TwoSum(int[] arr, int target){

        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int i=0;i<arr.length;i++){
//            map.put(arr[i],i);
//        }
//
//        for(Map.Entry<Integer,Integer> setElement : map.entrySet()){
//            int currVal =  setElement.getKey();
//            int leftVal = target - currVal;
//            if(map.containsKey(leftVal)){
//                System.out.println("Sum found at indices " + map.get(currVal) + " and " + map.get(leftVal));
//                break;
//            }
//
//        }

       for(int i=0;i<arr.length;i++){
           int leftVal = arr[i];
           if(map.containsKey(leftVal)){
               System.out.println(i + " " + map.get(leftVal));
           }
           else{
               map.put(arr[i],i);
           }
       }
    }

    public static void main(String[] args) {


        int[] arr = {1,3,3,4,5};
        int target = 6;
        TwoSum(arr,target);
    }
}
