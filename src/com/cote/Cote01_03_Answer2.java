package com.cote;

import java.util.Scanner;

public class Cote01_03_Answer2 {

    public String solution(String str){
        String answer = "";
        int max = Integer.MIN_VALUE, pos;

        while((pos = str.indexOf(' ')) != -1){
            // 띄어쓰기를 발견하지 못하면 -1를 반환함
            // 발견하면 index 번호를 리턴함
            // tmp는 띄어쓰기를 기준으로 단어가 입력된다.
            String tmp = str.substring(0,pos); // It, is, time, ...
            int len = tmp.length();
            if(len > max) {
                max = len;
                answer = tmp;
            }
            str = str.substring(pos+1); // 공백을 기준으로 이후 문자열을 str에 담는다.
        }
        // 마지막 단어(Study)의 길이가 max보다 클 경우 str
        if(str.length() > max){
            // indexOf + subString 조합에서는 마지막 단어에 대한 처리 필수
            answer = str;
        }
        return answer;
    }

    public static void main(String[] args) {
        Cote01_03_Answer2 an = new Cote01_03_Answer2();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(an.solution(str));
    }

}
