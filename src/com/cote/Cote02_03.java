package com.cote;

import java.util.Scanner;

public class Cote02_03 {

    public String solution(int n,int[] a, int[] b){
        String answer = "";
        for(int i=0; i<n;i++){
            if(a[i]==b[i])  answer += "D";
            else if(a[i]==1 && b[i] ==3)  answer += "A";
            else if(a[i]==2 && b[i] ==1)  answer += "A";
            else if(a[i]==3 && b[i] ==2)  answer += "A";
            else answer += "B";
        }
        return answer;
    }

    public static void main(String[] args) {
        Cote02_03 an = new Cote02_03();

        // n을 입력 받음
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr1 = new int[n];
        int [] arr2 = new int[n];
        // a
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        // b
        for(int i=0;i<n;i++){
            arr2[i] = sc.nextInt();
        }

        for(char x : an.solution(n,arr1,arr2).toCharArray()){
            System.out.println(x);
        }
    }

}
