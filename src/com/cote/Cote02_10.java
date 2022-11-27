package com.cote;

import java.util.Scanner;

public class Cote02_10{

    int [] dx = {-1,0,1,0};
    int [] dy = {0,1,0,-1};

    public int solution(int num, int[][]arr){
        int answer = 0;

        for(int i=1;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                int tmp = arr[i][j];
                System.out.println("arr[i][j]" + arr[i][j]);
                for(int k=0;k<dx.length;k++){
                    System.out.println(arr[i][j] + "===>" + arr[i+dx[k]][j+dy[k]]);
                }
                System.out.println();
            }
        }
        // answer 값을 증가시킴

        return answer;
    }


    public static void main(String[] args) {
        Cote02_10 an = new Cote02_10();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [][] arr = new int[num][num];
        for(int i=0; i<num;i++){
            for(int j=0;j<num;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(an.solution(num,arr));


    }

}
