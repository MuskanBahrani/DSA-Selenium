package org.example;

import java.util.Arrays;

public class Example6 {

    public static boolean isAnagram(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }

        s1 = s1.toLowerCase().trim();
        s2 = s2.toLowerCase().trim();

        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();

        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        for(int i=0;i<s1Array.length;i++){
            if(s1Array[i]!=s2Array[i]){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
         String s1 = "listen";
         String s2 = "silent";

        System.out.println(isAnagram(s1,s2));
    }
}
