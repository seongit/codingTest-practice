package com.cote;

import java.util.Scanner;

public class Cote06_01 {

    public int[] solution(int n, int[] arr){
        // 13 5 11 7 23일 경우
        for(int i=0; i<n-1; i++){
            int idx = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[idx]) idx = j; // j번째 요소의 값이 idx의 요소의 값보다 작을 경우, idx를 j로 변경
                // 1번 인덱스의 값인 5, 0번째 인덱스의 값인 13를 예로 idx는 1로 변경됨
            }
            // Swap
            int tmp = arr[i]; // arr[i]번째 요소의 값을 tmp 변수에 담음
            arr[i] = arr[idx]; // arr[idx]번째 요소의 값을 arr[i]번째에 담음
            arr[idx] = tmp; // idx번째에 tpm을 담음
        }

        return arr;
    }


    public static void main(String[] args) {

        Cote06_01 an = new Cote06_01();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++) arr[i] = sc.nextInt();
        for(int x : an.solution(n,arr)) System.out.print(x + " ");


    }

}
