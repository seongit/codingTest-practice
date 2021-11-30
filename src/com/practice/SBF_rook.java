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
        int[][] arr = new int[8][8];

        // 룩이 2개일 수 있으니 룩의 좌표는 배열로 선언
        int [] rookY = new int[2];
        int [] rookX = new int[2];
        int rookCnt = 0;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j] = sc.nextInt();
               if(arr[i][j]==2){
                    // rookY[0] rookX[0] -> 첫 번째 발견되는 룩의 좌표
                    // rookY[1] rookX[1] -> 두 번째 발견되는 룩의 좌표
                    rookY[rookCnt] = i;
                    rookX[rookCnt] = j;
                    rookCnt++;
                }
            }
        }

        boolean flag = false;
        // 오른쪽으로 이동.
        for(int k=0;k<2;k++){

            int ry = rookY[k];
            int rx = rookX[k];

            // 오른쪽으로 이동동
           for(int i=rx+1;i<8;i++){
                if(arr[ry][i]==1) flag = true;
                else if(arr[ry][i]==3) break;
            }

            // 왼쪽으로 이동
            for(int i=rx-1;i>=0;i--){
                if(arr[ry][i]==1) flag = true;
                else if(arr[ry][i]==3) break;
            }

            // 위로 이동
            for(int i=ry-1;i>=0;i--){
                if(arr[i][rx]==1) flag = true;
                else if(arr[i][rx]==3) break;
            }

            // 아래로 이동
            for(int i=ry+1;i<8;i++){
                if(arr[i][rx]==1) flag = true;
                else if(arr[i][rx]==3) break;
            }
        }

        if(flag == true) {
            System.out.println("1");
        } else System.out.println(0);

        // 룩 1에게 킹을 잡을 수 있는지 물어보기
        // 룩 2에게 킹을 잡을 수 있는지 물어보기
        // 둘 중 하나라도 킹을 잡을 수 있다면 킹은 잡힐 수 있음. 그게 아니라면 안잡힘

    }
}
