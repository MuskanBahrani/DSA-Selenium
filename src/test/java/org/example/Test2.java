package org.example;

import java.util.Stack;

public class Test2 {

    public static boolean isValid(String str){

//        if(str.length()%2!=0){
//            return false;
//        }

        Stack<Character> helperStack = new Stack<>();

        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            if(curr=='('){
                helperStack.push(curr);
            }
            else{
                if(helperStack.isEmpty()){
                    return false;
                }
                else{
                    helperStack.pop();
                }

            }
        }

        return helperStack.isEmpty();
    }

    public static void main(String[] args) {

        String str = "(()())";
        //String str = "(()))";
        //String str = " ";
        System.out.println(isValid(str));
    }
}
