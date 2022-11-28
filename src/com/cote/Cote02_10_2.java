package com.cote;

import java.util.Scanner;

public class Cote02_10_2 {

    int [] dx = {-1,0,1,0};
    int [] dy = {0,1,0,-1};

    public int solution(int num,int[][]arr){
        int answer = 0;

        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                boolean flag = true;
                int nx = 0; // 비교대상 x좌표 구하기
                int ny = 0; // 비교대상 y좌표 구하기
                for(int k=0;k<4;k++){
                    nx = i + dx[k];
                    ny = j + dy[k];
                    if(nx>=0 && nx<num && ny>=0 && ny<num && arr[i][j]<=arr[nx][ny]){
                        flag = false;
                        break;
                    }
                }
                if(flag)answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Cote02_10_2 an = new Cote02_10_2();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [][] arr = new int[num][num];
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(an.solution(num,arr));

    }

}
