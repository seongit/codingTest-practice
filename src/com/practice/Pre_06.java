package com.practice;

import java.util.Scanner;

public class Pre_06 {

    public static void main(String[]args){
        // 진행중
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i=0;i<=m-n;i++){
            System.out.print(n+i+" ");
            if(i%8==0){
                System.out.println();
            }
        }

    }

}
