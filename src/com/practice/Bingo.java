package com.practice;

import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {

        int [][] arr = new int [5][5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int order = 0;
        // 1) 숫자를 지울 수 있어야 한다.
        // 1-1) 숫자를 찾는다. = 위치를 알아낸다. = 반복문
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                int a;
                a = sc.nextInt();
                order++; // 숫자를 받자마자 order를 증가시킨다.
                // (1) a의 위치를 찾아야한다.
                // (2) a를 지워야함 = -1를 넣는다.
                for(int k=0;k<5;k++){
                    for(int p=0;p<5;p++){
                        if(arr[k][p]==a){
                            // (k,p)에 a가 있구나 !
                            arr[k][p] = -1;
                        }
                    }
                }
                int cnt = 0;
                for(int k=0;k<5;k++){
                    // K번째 줄에 X의 개수를 세겠다 ! = 가로줄이 얼마나 그어졌는지 알 수 있다.
                    int Xcnt = 0;
                    for (int p=0;p<5;p++){
                        if(arr[k][p]==-1){ // 가로 기준
                            Xcnt++;
                        }
                    }
                    if(Xcnt == 5) cnt++;
                }
                // (3) 몇 개의 줄이 지금까지 지워졌는지를 파악한다
                // (4) 3개 이상의 줄이 지워졌다면 끝 !

                for(int k=0;k<5;k++){
                    int Xcnt = 0;
                    for(int p=0;p<5;p++){
                        if(arr[p][k]==-1){ // 세로 기준
                            Xcnt++;
                        }
                    }
                    if(Xcnt==5) cnt++;
                }

                if(arr[0][0]==-1 && arr[1][1] == -1 && arr[2][2] == -1 && arr[3][3] == -1 && arr[4][4]==-1)cnt++;
                if(arr[0][4]==-1 && arr[1][3] == -1 && arr[2][2] == -1 && arr[3][1] == -1 && arr[4][0]==-1)cnt++;

                if(cnt >=3 ){
                    System.out.println(order);
                    return;

                }
            }
        }




    }
}
