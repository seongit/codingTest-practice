package com.cote;

import java.util.Scanner;

public class Cote02_07 {

    public int solution(int num,int[]arr){
        int answer = 0;
        int cnt = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==0) cnt = 0;
            else{
                cnt++;
                answer += cnt;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Cote02_07 an = new Cote02_07();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        int [] arr = new int[num];
        // 향상된 for문은 i의 값을 증가시키지 않음으로 일반 for문을 사용해야함
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(an.solution(num,arr));

    }

}
