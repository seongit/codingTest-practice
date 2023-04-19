package com.cote;

import java.util.Scanner;
import java.util.Stack;

public class Cote05_02 {

    public String solution(String str){
        String answer = "";
        Stack<Character> stack = new Stack<>();

        for(char x : str.toCharArray()){
            if(x == ')'){
                while (stack.pop() != '(');
            }else stack.push(x);
        }

        for(int i = 0; i < stack.size(); i++){
            answer += stack.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {

        Cote05_02 an = new Cote05_02();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(an.solution(str));

    }

}
