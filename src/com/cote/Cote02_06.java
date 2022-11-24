package com.cote;

import java.util.ArrayList;
import java.util.Scanner;

public class Cote02_06 {

    // 소수 판단 메소드
    public boolean is_Prime(int num){


        return true;
    }

    // 숫자 뒤집은 후 -> 소수 판단 메소드 호출
    public ArrayList<Integer>solution(int [] arr){
        ArrayList<Integer>answer = new ArrayList<>();
        // 문자 뒤집기

        int res = 0; // 뒤집어진 문자가 보관됨
        for(int i=0;i<arr.length;i++){
            int tmp = arr[i]
            int t = tmp % 10;
            res = tmp % 10;

        }

        return answer;
    }

    public static void main(String[] args) {
        Cote02_06 an = new Cote02_06();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [] arr = new int[num];

        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
        }

        for(int x : an.solution(arr)){
            System.out.print(x + " ");
        }

    }

}
