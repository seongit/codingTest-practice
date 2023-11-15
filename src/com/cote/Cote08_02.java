package com.cote;

import java.util.Scanner;

public class Cote08_02 {
    static int answer = Integer.MIN_VALUE, c, n;

    public void DFS(int L, int sum, int [] arr){
        // 합계가 c 무게를 초과할 수 없기 때문에 넘는 경우 return
        if(sum > c) return;
        if(L == n){
            // 기존 answer값과 sum중에서 큰 값으로 answer 갱신
            answer = Math.max(answer,sum);
        }else{
            // 부분집합으로 사용하는 경우
            DFS(L+1,sum+arr[L], arr);
            // 부분집합으로 사용하지 않는 경우
            DFS(L+1,sum,arr);
        }
    }

    public static void main(String[] args) {
        Cote08_02 T = new Cote08_02();
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        T.DFS(0,0,arr);
        System.out.println(answer);
    }

}
