package com.cote;

import java.util.Arrays;
import java.util.Scanner;

public class Cote06_05 {

    public String solution( int[] arr){
        String answer = "U";

        Arrays.sort(arr); // arr를 오름차순으로 정렬
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]==arr[i+1]) return "D";
        }

        return answer;
    }

    // 정렬로 풀기
    public static void main(String[] args) {

        Cote06_05 an = new Cote06_05();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(an.solution(arr));

    }
}
