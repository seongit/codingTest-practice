package com.cote;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Cote06_06 {

    public ArrayList<Integer> solution(int n, int[] arr){

        ArrayList answer = new ArrayList();
        int [] tmp = arr.clone();
        Arrays.sort(tmp);

        for(int i=0; i < arr.length; i++){
            if(arr[i] != tmp[i]) answer.add(i+1);
        }

        return answer;
    }

    // 정렬
    public static void main(String[] args) {
        Cote06_06 an = new Cote06_06();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int x : an.solution(n,arr)) System.out.print(x + " ");

    }

}
