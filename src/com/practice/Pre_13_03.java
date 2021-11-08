package com.practice;

import java.util.Scanner;

public class Pre_13_03 {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        // 전체 행의 개수
        int n = sc.nextInt();
        int space = n-1;
        int number = 1;

        //n개의 행이 출력됨
        for(int i=0;i<n;i++){
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            space--;

            if(i==0) System.out.print("🌟");
            for(int j=1;j<number;j++){
                System.out.print("*");
            }

            number+=2;
            System.out.println();
        }

    }

}
