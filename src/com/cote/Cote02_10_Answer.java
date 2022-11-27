package com.cote;

import java.util.Scanner;

public class Cote02_10_Answer{

    int [] dx = {-1,0,1,0};
    int [] dy = {0,1,0,-1};

    public int solution(int num, int[][]arr){
        int answer = 0;
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                // 봉우리인지 아닌지를 판단하는 boolean 변수를 만든다.
                boolean flag = true;
                for(int k=0;k<dx.length;k++){
                    int nx = i+dx[k]; // 탐색하고자 하는 값의 행 좌표
                    int ny = j+dy[k]; // 탐색하고자 하는 값의 열 좌표
                    // 만약 탐색하고자하는 값이 기준 값보다 작거나 같다면, flag를 false로 변경한다.
                    if(nx>= 0 && nx<num && ny>=0 && ny<num && arr[nx][ny] >= arr[i][j]){
                        flag = false;
                        break; // 하나라도 false일 경우 봉우리가 아니기 때문에 break로 빠져나옴 (*중요함)
                    }
                }
                if(flag) answer++;
            }
        }
        // answer 값을 증가시킴

        return answer;
    }


    public static void main(String[] args) {
        Cote02_10_Answer an = new Cote02_10_Answer();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [][] arr = new int[num][num];
        for(int i=0; i<num;i++){
            for(int j=0;j<num;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(an.solution(num,arr));


    }

}
