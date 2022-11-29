package com.cote;

import java.util.Scanner;

public class Cote02_12_2 {

    public int solution(int n, int m, int[][]arr){
        // (멘토,멘티)의 수
        int answer = 0;
        // 학생들이 짝지어질 수 있는 모든 경우를 구함
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                // arr 배열에 접근하여 값 구하기
                // k = 테스트 횟수 , s = 등수
                // i학생이 j학생보다 높은 등수일 경우 cnt 증가
                int cnt = 0;
                for(int k=0; k<m;k++){
                    int pi = 0, pj = 0;
                    for(int s=0; s<n;s++){
                        if(arr[k][s] == i) pi = s;
                        if(arr[k][s] == j) pj = s;
                    }
                    if(pi<pj){
                        cnt++;
                    }
                }
                // cnt가 m(=테스트횟수)과 동일할 경우 (=answer) 증가
                if(cnt==m){
                    answer++;
                }
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Cote02_12_2 an = new Cote02_12_2();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int [][] arr = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(an.solution(n,m,arr));
    }
}
