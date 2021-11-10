package com.practice;

import java.util.Scanner;

public class SBF_box {
    public static void main(String[]args){

        // 하나의 색은 최대 두 번 사용 가능하다 < 가장 중요한 관찰
        // 실제로 쓸 수 있는 색의 수는? -> 핵심
        // 같은 숫자가 3번 이상 나오면 실제로 쓸 수 있는 색의 수를 지운다.
        // 만약 6개이상이라면 칠할 수 있지만, 6개 미만이면 칠할 수 없다.

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [] arr = new int[num];
        int count = 0;
        int a = 1;
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            if(a==arr[i]) count++;
        }
        if(count>2){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }

    }
}
