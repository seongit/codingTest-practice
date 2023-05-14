package com.cote;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Cote06_08 {

    public int solution(int n, int m, int [] arr){
        int answer = 0;

        Arrays.sort(arr); // 오름차순으로 정렬

        int lt=0;
        int rt = n-1; // 0번 인덱스부터 시작하기 때문

        while(lt <= rt) { // 반복해서 좁혀 나감

            // lt가 rt보다 커지면 멈춰야한다.
            int mid = (lt + rt) / 2 ;// 인덱스 번호
            if(arr[mid] == m) {
                answer = mid + 1;
                break;
            }

            if(arr[mid] > m ) rt = mid - 1; // rt는 작아지고 lt는 커져야 함
            else lt = mid + 1;

        }

        return answer;
    }

    public static void main(String[] args) {
        Cote06_08 an = new Cote06_08();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(an.solution(n,m,arr));

    }

}
