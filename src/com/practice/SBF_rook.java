package com.practice;

import java.util.Scanner;

public class SBF_rook {
    public static void main(String[] args) {

        // 8x8 체스판
        // 0은 기물이 없는 상태
        // 1은 알랩의 킹
        // 2는 상대의 룩
        // 3은 그외 다른 기물

        // 1이 2에 잡힐 가능성
        // 배열을 선언한 뒤
        // 1 이후에 3이 있다면 0으로 출력한다. -> 킹이 룩에 잡힐 가능성 X
        // 1 이후에 3이 없고 2가 나온다면 1을 출력한다.  -> 킹이 룩에 잡힐 가능성 O

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j] = sc.nextInt();
            }
        }


    }
}
