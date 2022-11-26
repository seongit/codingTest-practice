package com.cote;

import java.util.Scanner;

public class Cote02_09 {

    public int solution(int [][] arr){
        int answer = Integer.MIN_VALUE;
        int sum1,sum2;

        for(int i=0;i<arr.length;i++){
            sum1 = sum2 = 0;
            for(int j=0;j<arr.length;j++){
                // 행의 합
                sum1 += arr[i][j];
                // 열의 합
                sum2 += arr[j][i];
                // answer 현재 비교하여 최대값으로 변경
                answer = Integer.max(answer,sum1);
                answer = Integer.max(answer,sum2);
            }
        }
        // 대각선의 합을 구하기 위해 초기화
        sum1 = sum2 = 0;
        for(int i=0; i<arr.length; i++){
            // 좌->우  대각선
            sum1 += arr[i][i];
            // 우->좌 대각선
            sum2 += arr[i][arr.length-1-i];
            answer = Integer.max(answer,sum1);
            answer = Integer.max(answer,sum2);

        }

        return answer;
    }

    public static void main(String[] args) {
        Cote02_09 an = new Cote02_09();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [][] arr = new int[num][num];

        for(int i=0;i<arr.length;i++){
           for(int j=0;j< arr.length;j++){
               arr[i][j] = sc.nextInt();
           }
        }

        System.out.println(an.solution(arr));

    }
}
