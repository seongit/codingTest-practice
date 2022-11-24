package com.cote;

import java.util.ArrayList;
import java.util.Scanner;

public class Cote02_01 {

    // if i == 0 -> answer.add(arr[i])
    // else if(arr[i] > arr[i+1]) -> anwer.add(arr[i])

    public ArrayList<Integer> solution(int[] arr){

        ArrayList <Integer> answer = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(i==0) answer.add(arr[i]);
            else if(arr[i] > arr[i-1]) answer.add(arr[i]);
        }

        return answer;
    }


    // 입력값 2개
    // 1. 몇 개의 숫자를 입력할 것인가?
    // 2. 어떤 숫자를 입력할 것인가?
    public static void main(String[] args) {
        Cote02_01 an = new Cote02_01();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [] arr = new int[num];

        for(int i=0; i < arr.length; i++){
           arr[i] = sc.nextInt();
        }

        for(int x : an.solution(arr)){
            System.out.print(x + " ");
        }

    }
}
