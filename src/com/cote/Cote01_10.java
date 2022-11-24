package com.cote;

import java.util.Scanner;

public class Cote01_10 {

    public int [] solution(String str,char ch){
        int [] answer = new int[str.length()]; // 동적으로 answer 배열의 크기 할당
        int p = 1000;
        // 왼쪽으로 부터 떨어진 거리가 출력됨
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch) {
                p = 0;
                answer[i] =p;
            }else {
                p++;
                answer[i] = p;
            }
        }
        p = 1000;
        for(int i=str.length()-1; i>=0; i--){
            if(str.charAt(i)==ch) {
                p = 0;
            }else {
                p++;
                answer[i] = Math.min(answer[i],p); // 기존 값(=answer[i])와 p중에 작은 값을 answer[i]에 집어넣는다.
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Cote01_10 an = new Cote01_10();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = sc.next().charAt(0);
        for(int x : an.solution(str,ch)){
            System.out.print(x + " ");
        }
    }
}
