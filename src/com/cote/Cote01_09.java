package com.cote;

import java.util.Scanner;

public class Cote01_09 {

    public int solution(String str){
        String answer = "";
        char[] arr = str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(Character.isDigit(arr[i])) answer += arr[i];
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Cote01_09 an = new Cote01_09();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(an.solution(str));
    }

}
