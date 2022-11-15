package com.cote;

import java.util.Scanner;

public class Cote01_06 {

    public String solution(String str){
        String answer = "";
        char [] arr = str.toCharArray();
        // 📌 향상된 for문에서는 인덱스 사용 불가
        for(int i=0; i<arr.length; i++){
            // indexOf 제일 앞에 있는 인덱스 위치를 반환한다.
            if(i == str.indexOf(str.charAt(i))) answer += str.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        // 문자열 입력 받는다.
        Cote01_06 an = new Cote01_06();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(an.solution(str));
    }

}
