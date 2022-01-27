package com.practice;

import java.util.Scanner;

public class ColorPaper {
    public static void main(String[] args) {
        int n;
        int[][] plane = new int[101][101];
        int [] count = new int[101];
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            int a,b,c,d ;
            // a : 가로
            // b : 세로
            // c : 가로길이
            // d : 세로길이

            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();
            for(int j=b;j<b+d;j++){
                for(int k=a;k<a+c;k++){
                    plane[j][k] = i+1;
                }
            }
        }

        // 1의 개수, 2의 개수, 3의 개수
        for(int i=0;i<101;i++){
            for(int j=0;j<101;j++){
                count[plane[i][j]]++; // plane 안에 있는 숫자의 개수를 count에 담은 것
            }
        }

        for(int i=1;i<=n;i++){
            System.out.println(count[i]);
        }


    }
}
