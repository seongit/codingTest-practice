package com.cote;

import java.util.Scanner;

public class Cote02_02 {

    public int solution(int [] arr){
        int answer = 0;
        int height = 0;
        for(int i=0;i<arr.length;i++){
            if(i==0) {
                answer+=1;
                height = arr[i];
            }else if(arr[i] > height) {
                answer+=1;
                height = arr[i];
            }
        }

        // 1. 맨 앞의 학생은 무조건 보임 -> answer++;

        // 2. 뒤에 있는 학생(i)은 바로 앞의 학생(i-1)보다 커야 보임 -> answer++;

        // 3. 뒤에 있는 학생이 앞에 있는 학생보다 작거나

        return answer;
    }

    public static void main(String[] args) {

        Cote02_02 an = new Cote02_02();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [] arr = new int[num];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(an.solution(arr));

    }

}
