package com.cote;

import java.util.Scanner;

public class Cote03_04_Answer {

    public int solution(int n, int m, int[]arr){
        int answer = 0, sum = 0, lt = 0;
        for(int rt=0; rt<n; rt++){
            sum+=arr[rt];
            // lt를 한번 빼서 되지 않는 경우도 있기 때문에 while문 사용해야함 E.g. 1 1 1 5
            while (sum > m){
                sum -= arr[lt++]; // lt값을 뺀 다음에 lt값을 증가
            }
            if(sum==m) answer++; // lt값을 빼고 나서도 sum값이 변경되기 때문에 확인해야함
        }
        return answer;
    }

    public static void main(String[] args) {
        Cote03_04_Answer an = new Cote03_04_Answer();
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
