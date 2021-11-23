package com.practice;

import java.util.Scanner;

public class SBF_maxofarr{

    public static void main(String[]args){

        // 21.11.24(수)
        // 한 행씩 검사해서 가장 큰 값(max)을 저장함
        // 가장 큰 값과 다음행을 비교하여 max가 다음행의 큰 값에 비해 작다면 max = 다음행의 큰 값
            // max가 더 크다면 변동 없음

        Scanner sc = new Scanner(System.in);
        // 9행 9열 선언 - index가 0부터 시작하기 때문
        int[][]arr = new int[10][10];

        // 각각의 자리수의 값을 알아야한다.
        // for문 2개를 돌린다.

        // r : 최대값 rx: 행 rx : 열
        int a = 0;
        int r = 0; // 최대값
        int rx = 0;
        int ry = 0;

        for(int i=1;i<10;i++){
            for(int j=1;j<10;j++){
                 arr[i][j] = sc.nextInt();
                 a = arr[i][j];
                if(r<a) { //  r이 a보다 작을 경우
                    r=a;
                    ry = i;
                    rx = j;
                };
                /*
                아래의 구문이 필요하지 않은 이유는 다음과 같다.
                한 행씩 최대값을 구하고 그 자리의 값을 기억한다면 조건을 충족하게 되는 것이다.
                조건 : r이 a와 같을 경우
                      1. 더 적은 행일 출력한다.
                      2. 행마저도 같다면 더 적은 열을 출력한다.
                      = 제일 처음 만난 최대값을 구한다.

                else if(r==a){ // r이 a와 같을 경우 1.행이 숫자가 적은 것을 출력한다. 2. 행 마저도 같다면 열이 적은 것을 출력한다.  (ry,rx)(i,j);를 비교하는 것이다.
                    if(i<ry || (i==ry && j<rx)){ // i가 최대값의 행보다 적거나,
                        ry = i;
                        rx= j;
                    }
                }
                */

            }
        }
        System.out.println(r);
        System.out.print(ry + " "+ rx);
    }
}
