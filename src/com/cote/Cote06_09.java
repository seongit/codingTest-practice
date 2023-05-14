package com.cote;

import java.util.Arrays;
import java.util.Scanner;

public class Cote06_09 {

    // 최소 용량으로 만들 수 있는 DVD 개수 카운트
    public int count(int[] arr, int capacity){
        int cnt = 1;
        int sum = 0;

        for(int x : arr){
            if(sum + x > capacity){
                cnt ++;
                sum = x; // DVD에 담긴 곡의 재생 길이
            }else sum += x; // DVD에 담긴 곡의 재생 길이 누적
        }
        
        return cnt;
    }

    public int solution(int n, int m, int [] arr){
        int answer = 0; // 최소 용량 크기

        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        // 이분 검색
        while (lt <= rt){
            int mid = (lt + rt) / 2;
            if(count(arr,mid)<=m){
                answer = mid;
                rt = mid - 1; // rt 감소
            }else lt = mid + 1; // lt 증가
        }


        return answer;
    }

    public static void main(String[] args) {
        Cote06_09 an = new Cote06_09();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[]arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(an.solution(n,m,arr));

    }

}
