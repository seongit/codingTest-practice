package com.cote;

import java.util.Arrays;
import java.util.Scanner;

public class Cote06_10 {

    public int count(int[]arr, int dist){
        int cnt = 1;

        int ep = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]-ep>= dist){
                cnt++;
                ep = arr[i];
            }
        }
        return cnt; // 배치한 마리 수
    }


    public int solution(int n, int m, int [] arr){
        int answer = 0;

        Arrays.sort(arr); // 오름차순으로 정렬
        int lt = 1;
        int rt = arr[n-1];
        while(lt <= rt){
            int mid = (lt + rt) / 2;

            if(count(arr,mid) >= m){
                answer = mid;
                lt = mid + 1;
            }else{
                rt = mid - 1;
            }

        }

        return answer;
    }

    public static void main(String[] args) {

        Cote06_10 an = new Cote06_10();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println( an.solution(n,m,arr));

    }

}
