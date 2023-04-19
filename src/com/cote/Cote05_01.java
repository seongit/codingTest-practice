package com.cote;

import java.util.Scanner;
import java.util.Stack;

public class Cote05_01 {

    public String solution(String str){

        String answer = "YES";

        Stack <Character> stack = new Stack<>();

        for(char x : str.toCharArray()){
            // 여는 괄호일 경우 stack에 담기
            if(x == '('){
                stack.push(x);
            }else{
                // 닫는 괄호가 많은 경우 return NO
                if(stack.isEmpty()) return "NO";
                stack.pop();

            }
        }

        // 여는 괄호가 많은 경우 retrun NO
        if(!stack.isEmpty()) return "NO";

        return answer;
    }


    public static void main(String[] args) {

        Cote05_01 an = new Cote05_01();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(an.solution(str));

    }

}
