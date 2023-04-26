package com.cote;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Cote05_06 {

    public int solution(int n, int k){

        int answer = 0;

        Queue<Integer> Q = new LinkedList<>();
        for(int i=1; i<=n; i++) Q.offer(i);
        while(!Q.isEmpty()){
            for(int i=1; i<k; i++) Q.offer(Q.poll());
            Q.poll(); // k를 외친 왕자 제거
            if(Q.size() == 1) answer = Q.poll();
        }

        return answer;

    }


    public static void main(String[] args) {

        Cote05_06 an = new Cote05_06();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(an.solution(n,k));

    }

}
