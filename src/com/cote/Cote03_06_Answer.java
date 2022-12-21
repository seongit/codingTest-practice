package com.cote;

import java.util.Scanner;

public class Cote03_06_Answer {

    public int solution(int n, int m, int[]arr){
        int answer = 0, cnt=0, lt=0;
        for(int rt=0; rt<n; rt++){
            if(arr[rt]==0) cnt++;
            while (cnt>m){
                if(arr[lt]==0) {
                    cnt--;
                }
                lt++;
            }
            answer = Math.max(answer, rt-lt+1);
        }
        return answer;
    }


    public static void main(String[] args) {

        Cote03_06_Answer an = new Cote03_06_Answer();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] arr = new int[n];

        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(an.solution(n,m,arr));

    }

}
