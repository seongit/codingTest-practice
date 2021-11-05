package com.practice;

import java.util.Scanner;

public class Pre_8 {

    public static void main(String[]args){

        // a b c를 사용자에게 입력 받기
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int answer = 0;

        // a부터 b까지 숫자 중 c의 배수를 찾기
        // a가 클 경우  a 10 b 4
        // 배열에 i를 차곡 차곡 담기 = 배열의 크기는? a
        //
        if(a>b){
            for(int i=b;i<=a;i++){
                if(i%c==0){
                    answer++;
                }
            }
        }
        // b가 클 경우
        for(int i=a;i<=b;i++){
            if(i%c==0){
                answer++;
            }
        }
        // a부터 b의 숫자 중 c의 배수를 발견하면 answer의 count 증가 시키기
        System.out.println(answer);
    }
}
