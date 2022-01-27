package com.practice;

import java.util.Scanner;

public class Attackrange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();
        int x = sc.nextInt();
        int c = sc.nextInt();
        int arr [][] = new int [105][105];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                //(1) i,j ~ y,x까지의 거리를 구함
                // (3,4) (2,6) -> 1+2 = 3
                int first = i-y;
                int second = j -x;
                if(first<0) first *= -1;
                if(second<0) second *= -1;
                int dist = first + second; // 거리

                if (dist == 0) arr[i][j] = -1;
                else if(dist <= c) arr[i][j] = dist;
                //(2) 이 거리가 c안에 들어오는가?
            }
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if (arr[i][j] == -1){System.out.print("x" + " ");}
                else System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
