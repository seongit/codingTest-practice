package com.cote;
import java.util.Locale;
import java.util.Scanner;

public class Cote01_01{

    public int solution(String str, Character ch){
        int result = 0;

        // 입력 받은 문자열과 특정문자를 대문자로 변환한다.
        String strTmp = str.toUpperCase();
        Character chTmp = Character.toUpperCase(ch);
        // str을 문자 배열로 변환한다.
        for (Character x : strTmp.toCharArray()){
            // ch와 비교한다.
            // 만약 일치할 경우 result를 1 증가한다.
            if(x == chTmp){
                result ++;
            }
        }




        // 결과를 리턴한다.
        return result;
    }

    public static void main(String[] args){

        // Main 객체를 생성한다.
        Cote01_01 m = new Cote01_01 ();
        Scanner sc = new Scanner(System.in);

        // 전체 문자열을 입력받는다.
        String str = sc.next();

        // 찾고자하는 특정 문자를 입력받는다.
        Character ch = sc.next().charAt(0);

        System.out.println(m.solution(str,ch));

    }
}
