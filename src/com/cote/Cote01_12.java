package com.cote;

import java.util.Locale;
import java.util.Scanner;

public class Cote01_12 {

    public String solution(String str, int n){
        String answer = "";
        for(int i=0;i<n;i++){
            String tmp = str.substring(0,7).replace('#','1').replace('*','0');
            int ch = Integer.parseInt(tmp,2);
            answer += (char)ch; // 형변환하면됨 char도
            str =  str.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {
        Cote01_12 an = new Cote01_12();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        System.out.println(an.solution(str,n));
    }

}
