package com.cote;

import java.util.Scanner;

public class Cote_01_06_Answer {

    public String solution(String str) {
        String answer = "";

        for(int i=0; i<str.length(); i++){
            if(i == str.indexOf(str.charAt(i))) answer += str.charAt(i);
        }

        return answer;
    }


    public static void main(String[] args) {
        // 문자열 입력 받는다.
        Cote_01_06_Answer an = new Cote_01_06_Answer();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(an.solution(str));
    }

}
