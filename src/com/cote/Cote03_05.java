package com.cote;

import java.util.Scanner;

public class Cote03_05 {

    public int soultuion(int n){
        int answer = 0, sum = 0, lt = 0;
        int m = n / 2 + 1;
        int [] arr = new int[m];

        for(int i=0; i<arr.length; i++){
            arr[i] = i+1;
        }

        for(int rt = 0; rt<arr.length; rt++){
            sum += arr[rt];
            while(sum>n){
                sum -= arr[lt++];
            }
            if(sum==n)answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Cote03_05 an = new Cote03_05();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(an.soultuion(n));

    }

}
