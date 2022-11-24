package com.cote;

import java.util.Scanner;

public class Cote02_05 {

    public int solution(int num){
        int answer = 0;
        int [] arr = new int[num+1]; // 동적 배열의 초기값은 0임.

        for(int i=2; i<arr.length;i++){
            System.out.println(i);
            // 소수를 찾는다. (= 배열의 값이 0일 경우 소수라고 정함)
            if(arr[i]==0){
                // 소수를 찾았다면, answer 증가
                answer++;
                // 소수의 배수를 찾는다. (2번째 for문)
                for(int j=i;j<num;j=j+i){
                    // 소스의 배수를 찾았다면, 배열의 값 1로 변경
                    arr[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Cote02_05 an = new Cote02_05();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(an.solution(num));

    }

}
