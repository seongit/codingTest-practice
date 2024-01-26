package com.cote;

import java.util.Scanner;

public class Cote08_03 {

    static int answer = Integer.MIN_VALUE, n, m;

    boolean flag = false;

    public void DFS(int L, int sum, int time, int[] ps, int[] pt){
        if(time > m) return; // 제한시간 보다 크면 return
        if(L == n){ // 부분집합 완성
            answer = Math.max(answer, sum);
        }else{
            DFS(L+1,sum + ps[L], time + pt[L], ps, pt);
            DFS(L+1 , sum, time, ps, pt);
        }
    }

    public static void main(String[] args) {

        Cote08_03 T = new Cote08_03();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // n개의 문제
        m = sc.nextInt(); // m분의 시간

        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0; i < n; i++){
            a[i] = sc.nextInt(); // 받을 수 있는 점수
            b[i] = sc.nextInt(); // 걸리는 시간
        }

        T.DFS(0,0,0, a, b);
        System.out.println(answer);
    }
}
