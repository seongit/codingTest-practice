package com.practice;

import java.util.Scanner;

public class Pre_04 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int answer = 0;

        for(int i=0;i<n;i++){
            answer = n - i;
            System.out.println(answer);
        }
    }

}
