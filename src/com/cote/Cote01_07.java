package com.cote;

import java.util.Locale;
import java.util.Scanner;

public class Cote01_07 {

    // StringBuffer 이용해서 뒤집기

    public String solution(String str){
        String answer = "YES";
        String strUpper = str.toUpperCase();
        String tmp = new StringBuilder(strUpper).reverse().toString();
        if(!strUpper.equals(tmp)) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        Cote01_07 an = new Cote01_07();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(an.solution(str));

    }

}
