package com.cote;

import java.util.Scanner;

public class Cote03_04 {

    public int solution(int n, int m, int[] arr){
        int answer = 0, sum = 0, lt = 0;

        for(int rt = 0; rt<n; rt++){
            // 만약, sum이 m보다 같거나 크면 sum에서 arr[lt]값을 뺀다.
            sum += arr[rt];
            // lt를 언제 증가 시켜야하지? -> sum에서 arr[lt]의 값을 뺀 다음에 증가시키면 됨
            if(sum >= m){
                sum -= arr[lt];
                System.out.println(lt);
            }

            if(sum == m){
                // 만약 sum이 m과 일치한다면 answer를 증가한다.
                answer++;
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        Cote03_04 an = new Cote03_04();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(an.solution(n,m,arr));


    }

}
