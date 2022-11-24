package com.cote;

import java.util.Scanner;

public class Cote01_11 {

    public String solution(String str){
        String answer = "";
        int cnt = 1;
        str = str + " ";

        for(int i=0;i<str.length()-1;i++){
          if(str.charAt(i)==str.charAt(i+1)) {
              // 같으면 cnt를 증가시킨다.
              cnt++;
          }else{
              answer += str.charAt(i);
              if(cnt>1) answer += String.valueOf(cnt);
              cnt =  1;
          }
        }
        return answer;
    }

    public static void main(String[] args) {
        Cote01_11 an = new Cote01_11();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(an.solution(str));
    }

}
