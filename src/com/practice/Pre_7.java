package com.practice;

import java.util.Scanner;

public class Pre_7 {

    public static void main(String[]args){
        // 통과!
        Scanner sc = new Scanner(System.in);
        // 사용자가 입력한 값
        int n = sc.nextInt();
        int a = 0;
        int b = 0;
        for(int i=1;i<=n;i++){
            // 제곱한 값
            a = i*i;
            b = (i-1)*(i-1);
            if(a>=n && b<n){
                System.out.println(i);
            }
        }
    }
}
