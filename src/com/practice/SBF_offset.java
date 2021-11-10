package com.practice;

import java.util.Scanner;

public class SBF_offset {

     /*

     2번만 계산하면 됨
     [0][0]
     [0][4]
     [4][0]
     [4][4]


     3번 계산해야 됨
     [1][0]
     [1][4]
     [2][0]
     [2][4]
     [3][0]
     [3][4]

     그 외에는 4번 계산해야됨


     조건
     - 상하좌우에 같은 수가 있다면 그 값은 변경하지 않는다.

        // 중간 부분
       if(1<=i && i<=3 && 1<=j && j<=3)
       if(arr[i-1][j] > arr[i][j] && arr[i][j-1] > arr[i][j] && arr[i][j+1] && arr[i+1][j]>arr[i][j]) *  출력

        // 중간 부분이 아니라면?
            // 꼭지점인지?
            // 꼭지점이 아닌지?

            if(i==0 && j==0)
                if(arr[i][j+1] == arr[i]ij && arr[i+1][j>arr[][j])
            // 꼭지점에 대해서 일일이 비교할 수 있다.


      */

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int arr[][]= new int[10][10];

        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                arr[i][j] = sc.nextInt();
            }
        };

        // 1 가장자리에 숫자 넣기 = 이럴 경우 가장 작은 값을 넣는 것이 아니라 가장 큰 값을 넣어야함
        // 가장 윗줄에 9 입력
        for(int i=0;i<=6;i++) arr[0][i] = 99;
        // 가장 아랫줄에 9 입력
        for(int i=0;i<=6;i++) arr[6][i] = 99;
        // 가장 왼쪽줄에 9 입력
        for(int i=0;i<=6;i++) arr[i][0] = 99;
        // 가장 오른쪽줄에 9입력
        for(int i=0;i<=6;i++) arr[i][6] = 99;

        // 2 각각의 숫자에 대해서 상하좌우로 비교
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                // 3 내가 가장 작다면 별표, 그게 아니라면 숫자 출력
                if(arr[i-1][j] > arr[i][j] &&
                   arr[i][j-1] > arr[i][j] &&
                   arr[i][j+1] > arr[i][j] &&
                   arr[i+1][j] > arr[i][j]){
                    System.out.print("* ");
                    }else{
                        System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
