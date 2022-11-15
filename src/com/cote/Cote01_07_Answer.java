package com.cote;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Cote01_07_Answer {

    public String solution(String str){
        String answer = "YES";
        // 굳이 새로운 String 객체 생성할 필요 없음
        str = str.toUpperCase();
        // str.length()로 풀기
        for(int i=0; i<str.length()/2 ; i++){
            if(str.charAt(i) != (str.charAt(str.length()-1-i))) return "NO";
        }
        return answer;
    }

    public static void main(String[] args) {
        Cote01_07_Answer an = new Cote01_07_Answer();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(an.solution(str));
    }
}
