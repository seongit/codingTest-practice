package com.practice;

import java.util.Scanner;

public class Pre_10 {
    public static void main(String[]args){
        // 소수 판별

        // n / 1 = n
        // n / n = 1
        // 이렇게 두 경우만 소수이고, n / 2 = x ... 이렇게 나눠 떨어지는 경우는 소수가 아니다.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 1부터 n를 제외하고 반복문을 돌려서 n/i로 나눠 떨어지는 경우 N를 출력 == 소수가 아니다.
        int cnt = 0;

        for(int i=1;i<n;i++){
            // 소수가 아니다.
            if(n%i==0) {
                cnt++;
            }
        }
        System.out.println(cnt);
        // 소수 = 약수 2개
        if(cnt==1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
