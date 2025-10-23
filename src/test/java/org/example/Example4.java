package org.example;

import java.util.HashMap;
import java.util.Map;

public class Example4 {

    public static int duplicateElement(int[] arr){

        int answer = -1;

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> setElement : map.entrySet()){
                if(setElement.getValue() >1){
                    answer = setElement.getKey();
                }
        }

        return answer;
    }


    public static void main(String[] args) {


        int[] arr = {1,2,3,4,2};
        System.out.println(duplicateElement(arr));
    }
}
