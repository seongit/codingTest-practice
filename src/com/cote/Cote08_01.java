package com.cote;

import java.util.Scanner;

public class Cote08_01 {


    static String answer = "NO";
    static boolean isFind = false;
    static int n,total= 0; // Level, 입력된 숫자, 입력된 데이터의 총합
    public void DFS(int L, int sum,int[] arr){

        // 찾은 경우 나머지 스택은 돌지 않음
        if(isFind) return;
        // sum이 total / 2보다 크다면 두 부분집합의 합이 다르므로 return
        if(sum > total / 2) return;
        if(L==n){
            // 마지막 레벨까지 돈 경우
            if((total - sum) == sum){
                answer = "YES";
                isFind = true;
            }
        }
        else{
            // 부분집합에 포함하는 경우
            DFS(L+1, sum + arr[L],arr);
            // 부분집합에 포함하지 않는 경우
            DFS(L+1, sum,arr);
        }
    }

    public static void main(String[] args) {
        Cote08_01 an = new Cote08_01();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        an.DFS(0,0,arr);
        System.out.println(answer);
    }

}
