package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class Example7 {

    public static char nonRepeatingFirstChar(String str){

        LinkedHashMap<Character,Integer> helperMap = new LinkedHashMap<Character,Integer>();

        for(int i=0;i<str.length();i++){

            char c = str.charAt(i);

            if(helperMap.containsKey(c)){
                helperMap.put(c,helperMap.get(c)+1);
            }
            else{
                helperMap.put(c,1);
            }
        }

        for(Map.Entry<Character,Integer> setElement : helperMap.entrySet()){
            if(setElement.getValue()==1){
                return setElement.getKey();
            }
        }

        return '$';
    }

    public static void main(String[] args) {
        String s1 = "aabbcdd";
        System.out.println(nonRepeatingFirstChar(s1));
    }
}
