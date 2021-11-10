package com.practice;

import java.util.Scanner;

public class Pre_02_02 {
    public static void main(String[]args){
        // 윷놀이
        // 배를 int로 초기화한다.
        int cnt= 0;

        // 배열 생성
        String[] arr = new String[4];

        // 4개의 입력 값을 받는다.
        Scanner sc = new Scanner(System.in);

       // 하나의 배열에 입력 값을 담는다.

        for(int j=0;j<3;j++){
            for(int i=0;i<4;i++){
                arr[i] = sc.next();
            }
            // 반복문을 배열의 길이만큼 돌려서 0의 개수를 구한다.
            for(int i=0; i<4;i++){
                if(arr[i].equals("0")){
                    cnt++;
                }
            }

            if(cnt==1) System.out.println("A");
            if(cnt==2) System.out.println("B");
            if(cnt==3) System.out.println("C");
            if(cnt==4) System.out.println("D");
            if(cnt==0) System.out.println("E");

            cnt = 0;
        };

    }

}
