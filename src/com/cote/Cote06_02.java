package com.cote;

import java.util.Scanner;

public class Cote06_02 {

    public int [] solution(int n, int[] arr){
        // 버블정렬 - 앞이 크고 뒤가 작으면 바꿔준다.
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                // i가 증가함에 따라 j는 1씩 감소 되어야 함. 버블정렬에서 1회 정렬이 끝난 뒤 가장 큰 값이 요소의 마지막에 오기 때문!
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }

        return arr;
    }


    public static void main(String[] args) {
        Cote06_02 an = new Cote06_02();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<arr.length; i++) arr[i] = sc.nextInt();
        for(int x : an.solution(n, arr)) System.out.print(x + " ");
    }

}
