package com.practice;

import java.util.Scanner;

public class SBF_maxofarr{

    public static void main(String[]args){

        // 21.11.23 진행중
        // 한 행씩 검사해서 가장 큰 값(max)을 저장함
        // 가장 큰 값과 다음행을 비교하여 max가 다음행의 큰 값에 비해 작다면 max = 다음행의 큰 값
            // max가 더 크다면 변동 없음


        Scanner sc = new Scanner(System.in);
        // 9행 9열 선언 - index가 0부터 시작하기 때문
        int[][]arr = new int[9][9];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(arr[3][0]);
    }
}
