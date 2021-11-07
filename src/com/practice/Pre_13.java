package com.practice;

import java.util.Scanner;

public class Pre_13 {

    public static void main (String[]args){

        // 전체 회수를 진행할 n을 입력 받는다.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // 시작수를 입력 받는다.
        int s = sc.nextInt();

        // 공백 출력 횟수가 담긴 변수
        int space = n-1;
        // 한 행에 몇 개의 숫자가 출력되는지 정하는 변수
        int number = 1;

        // 현재 첫번째 숫자
        int currentFirst=0;

        // 이전 줄의 첫번째 숫자
        int preFirst = s;

        // 이전 줄의 마지막 숫자
        int preLast = 0;

        // n번만큼 반복한다.
        for(int i=1;i<=n;i++){
            // 공백을 출력시킬 목적
            for(int j=0;j<space;j++) {
                System.out.print(" ");
            }
            space--;
            // 짝수 줄, 증가하면서 출력
            if(i%2==0){
                currentFirst = preFirst + 1;
                if(currentFirst>=10) currentFirst=1;

                for(int j=0;j<number;j++){
                    System.out.print(currentFirst);
                    preLast = currentFirst;
                    currentFirst +=1;
                    if(currentFirst>=10)currentFirst=1;
                }
            }else{
                // 홀수 줄
                if(i==1)currentFirst=s;
                else {
                    currentFirst = preLast;
                    for(int j=0;j<number;j++){
                        currentFirst += 1;
                        if(currentFirst>=10)currentFirst=1;
                    }
                }
                preFirst = currentFirst;
                for(int j=0;j<number;j++){
                    System.out.print(currentFirst);
                    currentFirst -= 1;
                    if(currentFirst<=0)currentFirst=9;
                }
            }
            number += 2;
            System.out.println();
        }
    }
}
