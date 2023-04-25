package com.cote;

import java.util.Scanner;
import java.util.Stack;

public class Cote05_05 {

    public int solution(String str){
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '(') {
                stack.push('(');
            }else {
                // 닫는 괄호인 경우 stack.pop()
                stack.pop();
                if(str.charAt(i-1) == '('){
                    // 1. 레이저의 끝 ( i - 1이 여는 괄호인 경우 )
                    answer += stack.size();
                }else{
                    // 2. 막대기의 끝
                    answer += 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Cote05_05 an = new Cote05_05();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(an.solution(str));

    }

}
