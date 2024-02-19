package com.cote;

import java.util.Scanner;

public class Cote08_02 {

    static int total,sum,n= 0;
    static int answer = Integer.MIN_VALUE;
    static int[] arr;

    public void DFS(int L, int sum){
        if(sum > total) return;
        if(L==n){
            answer = Math.max(answer,sum);
        }else{
            DFS(L+1, sum+arr[L]);
            DFS(L+1,sum);
        }
    }

    public static void main(String[] args) {

        Cote08_02 an = new Cote08_02();
        Scanner sc = new Scanner(System.in);
        total = sc.nextInt();
        n = sc.nextInt();

        arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        an.DFS(0,sum);
        System.out.println(answer);
    }

}
