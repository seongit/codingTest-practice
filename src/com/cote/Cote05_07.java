package com.cote;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Cote05_07 {

    public String solution(String need, String plan){

        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();

        for(char x : need.toCharArray()) Q.offer(x); // 필수 과목을 queue에 담음

        for(char x : plan.toCharArray()){
            if(Q.contains(x)) {
                if (x != Q.poll()) return "NO";
            }
        }

        if(!Q.isEmpty()) return "NO"; // queue가 비어있지 않을 경우 필수 과목을 이수하지 않은 것이기 때문


        return answer;
    }

    public static void main(String[] args) {

        com.cote.Cote05_07 an = new com.cote.Cote05_07();
        Scanner sc = new Scanner(System.in);

        String need = sc.nextLine();
        String plan = sc.nextLine();

        System.out.println(an.solution(need,plan));

    }


}
