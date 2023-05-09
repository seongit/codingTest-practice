package com.cote;

import java.util.Scanner;

public class Cote06_04 {

    public int [] solution(int size, int n, int [] arr){

        int [] cache = new int[size];

        /**
         * cache miss : 해야할 작업이 캐시에 없는 상태로 새로운 작업이 캐시에 들어올 경우
         * cache hit : 해야할 작업이 캐시에 있는 상태
         */

        for(int x : arr){
            int pos = -1;    // pos = 인덱스 위치
            // cache hit된 지점의 index 저장
            for(int i=0; i<size; i++) if (x==cache[i]) pos = i;
            // cache miss 처리
            if(pos == -1){
                for(int i=size-1; i>=1; i--){
                    cache[i] = cache[i-1]; //2 1 0 0 0 -> 3 2 1 0 0
                }
            }else{
                // cache hit 처리
                for(int i=pos; i>=1; i--){ // hit이 발생한 지점부터
                    cache[i] = cache[i-1]; // 3 2 1 0 0 -> 2 3 1 0 0
                }
            }
            cache[0] = x;
        }
        return cache;
    }


    public static void main(String[] args) {
        Cote06_04 an = new Cote06_04();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();

        int [] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int x : an.solution(s, n,arr)) System.out.print(x + " ");

    }

}
