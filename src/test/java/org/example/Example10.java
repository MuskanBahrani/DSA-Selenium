package org.example;

public class Example10 {


    public static String compressedString(String str) {

        String answer = "";

        char curr = str.charAt(0);
        int count  = 1;

        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==curr){
                count++;
            }
            else{
                answer += curr;
                answer += count;
                curr = str.charAt(i);
                count = 1;
            }
        }


        answer += curr;
        answer += count;

        if(str.length() > answer.length()){
            return answer;
        }
        else{
            return str;
        }

    }


    public static void main(String[] args) {


        String str = "abcd";
        System.out.println(compressedString(str));
    }
}
