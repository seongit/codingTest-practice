package com.cote;

import java.util.Scanner;
import java.util.Stack;

public class Cote05_04 {

    public int solution(String str){
        int answer = 0;
        Stack <Integer> stack = new Stack<>();
        // 문자열 -> char 배열
        for(char x : str.toCharArray()) {
            // 숫자일 경우 stack에 넣음 ( X - 48 )
            /**
             * char 배열은 문자형이기 때문에 Stack<Integer> 타입와 일치하지 않음
             * '0'의 아스키코드는 48이므로
             * x - 48 을 해야 변환된 숫자가 Stack에 담김
             */
            if (Character.isDigit(x)) {
                stack.push(x - 48);
            } else {
                // 문자일 경우 stack에서 꺼냄
                int rt = stack.pop();
                int lt = stack.pop();
                // 결과값 다시 push
                if (x == '+') {
                    stack.push(lt + rt);
                } else if (x == '-') {
                    stack.push(lt - rt);
                } else if (x == '*') {
                    stack.push(lt * rt);
                } else if (x == '/') {
                    stack.push(lt / rt);
                }
            }
        }
        // stack.get(0)을 return
        answer = stack.get(0);

        return answer;
    }

    public static void main(String[] args) {


        Cote05_04 an = new Cote05_04();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(an.solution(str));

    }


}
