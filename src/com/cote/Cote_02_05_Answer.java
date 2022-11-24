package com.cote;

import java.util.Scanner;

public class Cote_02_05_Answer {

    public int solution(int n){
        int answer = 0;
        int [] arr = new int[n];

        for(int i=2;i<n;i++){
            if(arr[i]==0){
                answer++;
                for(int j=i;j<n;j=j+i){
                    arr[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Cote_02_05_Answer an = new Cote_02_05_Answer();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(an.solution(num));
    }

}
