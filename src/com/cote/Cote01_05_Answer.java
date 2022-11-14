package com.cote;

import java.util.Scanner;

public class Cote01_05_Answer {

    public String solution(String str){
        String answer = "";
        char [] arr = str.toCharArray();
        int lt = 0;
        int rt = str.length()-1;

        while(lt < rt){
            // 알파벳이 아닐 때 참이된다.
            if(!Character.isAlphabetic(arr[lt])) lt++;
            else if(!Character.isAlphabetic(arr[rt])) rt--;
            else {
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(arr);
        return answer;
    }

    public static void main(String[] args) {

        Cote01_05_Answer an = new Cote01_05_Answer();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(an.solution(str));

    }

}
