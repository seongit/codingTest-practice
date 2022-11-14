package com.cote;

import java.util.*;

public class Cote01_03 {

    public String solution(String str){
        String answer = "";
        int max = Integer.MIN_VALUE;
        // str을 공백 기준으로 쪼개서 String 배열에 저장한다.

        String [] arr = str.split(" ");
        // arr 배열에 단어가 하나씩 담김
        for(String x : arr){
           if(x.length() >  max){
               max = x.length();
               answer = x;
           }
        }
        // 단어의 길이를 max에 담는다.
        return answer;
    }

    public static void main(String[] args) {

        Cote01_03 m = new Cote01_03();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(m.solution(str));
    }
}
