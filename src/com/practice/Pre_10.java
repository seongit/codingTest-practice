package com.practice;

import java.util.Scanner;

public class Pre_10 {
    public static void main(String[]args){

        // n / 1 = n
        // n / n = 1
        // 이렇게 두 경우만 소수이고, n / 2 = x ... 이렇게 나눠 떨어지는 경우는 소수가 아니다.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 1부터 n를 제외하고 반복문을 돌려서 n/i로 나눠 떨어지는 경우 N를 출력 == 소수가 아니다.
        String str = "";
        int cnt = 0;
        for(int i=2;i<=n-1;i++){
            // 소수가 아니다.
            if(n%i==0) {
                cnt++;
                str = "NO";
            }
            if(cnt==0){
                str="YES";
            }
        }
        System.out.println(str);
        // 출력은 한번만 되어야 한다 == 반복문 안에 들어가면 안된다.
    }
}
