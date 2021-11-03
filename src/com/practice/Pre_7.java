package com.practice;

import java.util.Scanner;

public class Pre_7 {

    public static void main(String[]args){
        // 진행중
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int answer = 0;

        for(int i=0;i<=a;i++){
            int b = i*i;
            if(b<=a){
                answer = i;
            }
            System.out.println(b);
        }
        System.out.println(answer);
    }

}
