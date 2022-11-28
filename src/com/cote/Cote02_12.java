package com.cote;

import java.util.Scanner;

public class Cote02_12 {

    public int solution(int n,int m, int [][] arr){
        int answer = 0;
        // 1번학생부터 4번학생까지의 각각의 경우의 수를 구하기 위해 바깥에 2중 for문 사용
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                int cnt = 0;
                for(int k=0; k<m; k++){
                    int pi = 0; // 기준학생의 등수를 담을 변수
                    int pj = 0; // 비교대상학생의 등수를 담을 변수
                    for(int s=0; s<n ; s++){
                        // arr 인덱스에 접근하기 위해 다시 2중 for문 사용
                        if(arr[k][s] == i) pi = s;
                        if(arr[k][s] == j) pj = s;
                    }
                    // 만약, 기준학생의 등수가 비교대상학생의 등수보다 높을경우 cnt를 증가
                    if(pi<pj) cnt++;
                }
                // cnt가 m(=시험의 횟수)와 같을 경우 = m번의 시험에서 모두 기준학생의 등수가 높을 경우 answer를 증가시킴
                if(cnt == m){
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Cote02_12 an = new Cote02_12();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] arr = new int[m][n]; // 3행 4열 배열을 만든다

        for(int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(an.solution(n,m,arr));
    }

}
