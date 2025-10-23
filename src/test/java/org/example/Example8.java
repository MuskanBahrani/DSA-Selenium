package org.example;

import java.util.HashSet;

public class Example8 {

    public static boolean allUnique(String str , int start, int end){
        HashSet<Character> helperSet = new HashSet<Character>();
        for(int i = start;i<=end;i++){
            if(helperSet.contains(str.charAt(i))){
                return false;
            }
            else{
                helperSet.add(str.charAt(i));
            }
        }
        return true;
    }

    public static int nonRepeatingSubString(String str){

        int maxLength = 0;

        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                if(allUnique(str , i , j)){
                    maxLength = Math.max(maxLength , j-i+1);
                }
            }
        }


        return maxLength;
    }

    public static void main(String[] args) {

        String str = "abccd";
        System.out.println(nonRepeatingSubString(str));
    }
}
