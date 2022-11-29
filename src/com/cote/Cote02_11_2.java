package com.cote;

import java.util.Scanner;

public class Cote02_11_2 {

    public int solution(int num, int[][]arr){
        int answer = 0, max = Integer.MIN_VALUE;

        for(int i=1; i<=num; i++){
            int cnt = 0;
            for(int j=1; j<=num;j++){
                for(int k=1; k<6;k++){
                    if(arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }

                }

            }
            if(cnt>max){
                max = cnt;
                answer = i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Cote02_11_2 an = new Cote02_11_2();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [][] arr = new int[num+1][6];
        for(int i=1; i<=num; i++){
            for(int j=1; j<6; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(an.solution(num,arr));

    }

}
