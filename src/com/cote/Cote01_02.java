package com.cote;

import java.util.Scanner;

public class Cote01_02 {

    public String solution(String str){
        String answer = "";

        for (Character x : str.toCharArray()){
            // 소문자라면? 대문자로 변경함
            if(Character.isLowerCase(x)){
                answer += Character.toUpperCase(x);
            }else {
            // 소문자가 아니라면 ? (= 대문자라면) 소문자로 변경
                answer += Character.toLowerCase(x);
            }

        }

        return answer;
    }

    public static void main(String[] args) {

        Cote01_02 m = new Cote01_02();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(m.solution(str));

    }

}
