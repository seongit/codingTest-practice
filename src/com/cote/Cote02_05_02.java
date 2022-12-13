package com.cote;

import java.util.Scanner;

public class Cote02_05_02 {

    public int solution(int n){
        int answer = 0, cnt = 1;
        n--;
        while (n>0){
            cnt++;
            n = n-cnt;
            if(n % cnt==0) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {

        Cote02_05_02 an = new Cote02_05_02();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(an.solution(n));

    }

}
