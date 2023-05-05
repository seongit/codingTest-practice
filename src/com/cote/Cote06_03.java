package com.cote;

import java.util.Scanner;

public class Cote06_03 {

    public int[] solution(int n, int[]arr){

        for(int i=1; i<n; i++){
            int tmp = arr[i], j; // tmp이 자기 자리를 찾는 것

            for(j=i-1; j>=0; j--){
                // i 방향 ->
                // j 방향 <-
                if(arr[j]>tmp){
                    arr[j+1] = arr[j];
                }else break;

            }
            arr[j+1] = tmp; // j가 멈춘 지점 + 1번째에 tmp을 넣기 위함
        }
        return arr;
    }


    public static void main(String[] args) {
        Cote06_03 an = new Cote06_03();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<arr.length; i++) arr[i] = sc.nextInt();
        for(int x : an.solution(n,arr)) System.out.print(x + " ");
    }

}
