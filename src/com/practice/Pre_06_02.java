package com.practice;

import java.util.Scanner;

public class Pre_06_02 {

    public static void main(String[]args){
        // 통과
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int cnt = 0;
        for(int i=n;i<=m;i++){
            System.out.print(i+" ");
            cnt++;
            if(cnt%8==0){
                System.out.println();
            }
        }
    }
}
