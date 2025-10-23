package org.example;

public class Example9 {


    public static String reverseString(String str){
        String answer = "";
        String[] helperArray = str.split(" ");

        if(helperArray.length == 0){
            return null;
        }

        if(helperArray.length == 1){
            return str;
        }

        for(int i=helperArray.length-1; i>=0; i--){
            answer += helperArray[i];
            answer += " ";
        }
        return answer;
    }

    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(reverseString(str));
    }
}
