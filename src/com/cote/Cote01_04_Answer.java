package com.cote;

import java.util.ArrayList;
import java.util.Scanner;

public class Cote01_04_Answer {

    public ArrayList<String> solution(int num, String [] str){
        ArrayList<String> answer = new ArrayList<>();

        for(String x : str){
            char[] arr = x.toCharArray(); // x 단어를 갖는 String이 char 배열로 변경된다. -> 문자 배열화 된다.
            int lt = 0;
            int rt = x.length()-1; // 마지막 문자
            while (lt < rt){
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(arr); // arr의 문자 배열을 String화 시켜줌 -> valueOf는 static 메소드이기 때문에 클래스명.valueOf로 접근
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {

        Cote01_04_Answer an = new Cote01_04_Answer();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String [] str = new String[num];
        for(int i=0;i<num;i++){
            str[i] = sc.next();
        }

        for(String x : an.solution(num, str)){
            System.out.println(x);
        }

    }

}
