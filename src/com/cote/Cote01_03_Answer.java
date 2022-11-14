package com.cote;

import java.util.Scanner;

public class Cote01_03_Answer {

    public String solution(String str){
        String answer = "";
        int m = Integer.MIN_VALUE;
        String [] s = str.split(" ");
        for(String x : s){
            int len = x.length();
            if(len > m ){
                m = len;
                answer = x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Cote01_03_Answer an = new Cote01_03_Answer();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(an.solution(str));

    }

}
