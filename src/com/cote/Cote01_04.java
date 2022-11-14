package com.cote;

import java.util.ArrayList;
import java.util.Scanner;

public class Cote01_04 {

    public ArrayList<String> solution(int num, String [] str){

        ArrayList<String> answer = new ArrayList<>();

        for(String x : str){
            /*
            1. x를 가져와서 StringBuilder 객체 생성 (각 단어들이 StringBuilder 객체에 담김)
            2. reverse() : 해당 단어를 뒤집음
            3. toString() : String 객체로 변환하기 위해 사용함함
            4. tmp에는 뒤집어진 x가 담긴다.
            */
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp); // 뒤집어진 문자들이 arrayList에 담긴다.
        }

        return answer;
    }

    public static void main(String[] args) {
        Cote01_04 an = new Cote01_04();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String [] str = new String[num]; // 사용자가 입력한 값만큼의 배열이 생성됨
        for(int i=0; i<num; i++){
            str[i] = sc.next(); // i번째 인덱스에 사용자가 입력한 문자열 담김
        }
        for(String x : an.solution(num,str)){ // String을 원소로 받는 ArrayList가 반환됨
            System.out.println(x); // 배열을 출력한다.
        }

    }

}
