package com.cote;

import java.util.Scanner;

public class Cote01_08 {

    // 알파벳 이외의 문자들은 무시한다.
    public String solution(String str){
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]","");
        String tmp = new StringBuilder(str).reverse().toString();

        if(str.equals(tmp)){
            return "YES";
        }

        return answer;
    }

    public static void main(String[] args) {

        Cote01_08 an = new Cote01_08();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(an.solution(str));
    }

}
