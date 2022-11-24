package com.cote;

import java.util.Scanner;

public class Cote02_04 {

    public int [] solution(int num){
        int [] answer = new int[num];
        answer[0] = 1;
        answer[1] = 1;

        for(int i=2; i<answer.length; i++){
            answer[i] = answer[i-1] + answer[i-2];
        }

        return answer;
    }

    public static void main(String[] args) {
        Cote02_04 an = new Cote02_04();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int x : an.solution(num)){
            System.out.print(x + " ");
        }

    }

}
