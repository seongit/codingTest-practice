package com.cote;

import java.util.Scanner;

public class Cote01_09_Answer {

    public int solution(String str){
        String answer = "";
        for(char x : str.toCharArray()){
            if(Character.isDigit(x)) answer += x;
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Cote01_09_Answer an = new Cote01_09_Answer();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(an.solution(str));
    }

}
