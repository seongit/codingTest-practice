package com.practice;

import java.util.Scanner;

public class SBF_GCD_LCM {

        public static void main(String[]args){


            // 유클리드호제법

            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int A = a; // 원본 숫자 저장
        int B = b;

        while(true){
            int c = a%b;
            if(c==0) break;
            a = b;
            b = c;
        }
        int GCD = b;
        int LCM = GCD * (A/GCD) * (B/GCD); // 최소공배수

        System.out.println(GCD);
        System.out.println(LCM);


        // 성은 로직
        // 두 수를 입력 받는다.
        // 입력 받은 두 수를 i로 나눈다. (i의 값은 2부터 시작한다.)
        // 나누어 떨어질 경우 몫을 외부 변수에 저장한다
        // 외부 변수(1)과 외부변수(2)의 값이 같을 경우 최종으로 해당 결과값을 저장한다.
        // i가 증가된다.

        /*
        int result1 = 0;
        int result2 = 0;
        int answer = 0;

        for(int i=1;i<10;i++){
            result1=a/i;
            result2=b/i;
            //System.out.println(result1);
            System.out.println(result2);
            if(result1==result2){
                answer = result1;
            }
        }
        System.out.println(answer);
         */
    }
}
