package com.cote;

import java.util.Scanner;

public class Cote02_11 {

    public int solution(int num, int [][]arr){
        int answer = 0, max = Integer.MIN_VALUE;

        for(int i=1; i<=num; i++){ // 기준학생
            int cnt = 0;
            for(int j=1; j<=num; j++){ // 비교대상학생
                for(int k=1; k<6; k++){ // 반번호
                    // 기준학생의 반과 비교대상학생의 반을 비교한다.
                    if(arr[i][k] == arr[j][k]){
                        // 같은 반인 경우 cnt 증가
                        cnt++;
                        break;
                        // 반드시 break를 해야 정답이 나옴
                        // why? 만약 기준학생의 반과 비교대상학생의 반이 한번이라도 같으면 cnt 증가하고 끝나하며 이후 같은 반이더라도 cnt가 증가하면 안 됨
                    }
                }
            }
            if(cnt > max){
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Cote02_11 an = new Cote02_11();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [][] arr = new int[num+1][6];
        for(int i=1; i<=num;i++){ // 학생번호
            for(int j=1; j<=5;j++){ // 반번호
                //j<=num으로 하면 오답으로 나옴
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(an.solution(num,arr));
    }
}
