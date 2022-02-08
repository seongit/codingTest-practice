package com.practice;

import java.util.Scanner;

public class Baseball_Game {
    public static void main(String[] args) {
        int n;
        int [][] info = new int[105][3];
        int result = 0; // 조건에 만족하는 숫자의 개수

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i=0;i<n;i++){
            info[i][0] = sc.nextInt();
            info[i][1] = sc.nextInt();
            info[i][2] = sc.nextInt();
        }

        for(int i=1;i<10;i++){
            for(int j=1;j<10;j++){
                for(int k=1;k<10;k++){

                    // i j k 가 모두 다른 숫자이다.
                    boolean flag = false;
                    if(i != j && j != k && i != k){
                        for(int p=0;p<n;p++){
                            // info[p]와 ijk가 조건을 만족하는지를 체크

                            // 327 first second thirde
                            // 236 ijk

                            int first = info[p][0] / 100;
                            int second = (info[p][0] / 10) % 10;
                            int third = info[p][0] % 10 ;

                            int strike = 0;
                            int ball = 0;

                            if(first == i ) strike++;
                            if(second == j ) strike++;
                            if(third == k) strike ++;

                            if(i == second || i == third) ball++;
                            if(j == first || j == third) ball++;
                            if(k == first || k == second) ball++;

                            if(info[p][1] != strike || info[p][2]!=ball) flag = true; // n번 반복 중에 한 번이라도 이 조건을 만족하지 않는다면 flag의 값은 true가 된다.
                        }

                        if(flag == false){
                            result++;
                        }

                    }

                }
            }
        }
        System.out.println(result);
    }
}
