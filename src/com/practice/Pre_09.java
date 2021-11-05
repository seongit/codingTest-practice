package com.practice;

import java.util.Scanner;

public class Pre_09 {
    // 100점!
    public static void main(String[]args){
        // 사용자에게 값을 입력 받는다.
        Scanner sc = new Scanner(System.in);

        // 약수 n
        int n = sc.nextInt();
        // k번째로 작은 수
        int k = sc.nextInt();

        int count = 0;
        int flag = 0; // if문 안에 들어갔는지 아닌지를 확인하는 용도

        for(int i=1;i<=n;i++){
            if(n%i==0) {// n은 i의 배수인가? == i는 n의 약수이다.
                count++; // 몇 번째 약수인가?
                // i는 count번째로 작은 약수이다.
                if(count == k){
                    System.out.println(i);
                    flag = 1; // 10의 배수 1,2,5,10인 k의 개수는 4만 나와야한다.
                }
            }
        }
        if(flag == 0){
            System.out.println(0);
        }
    }

}
