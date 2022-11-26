package com.cote;

import java.util.Scanner;

public class Cote02_08 {

    public int [] soulution(int num,int[] arr){
        int [] answer = new int[num];

        for(int i=0;i<arr.length;i++){
            int rank = 1;
            for(int j=0;j<arr.length;j++){
                if(arr[j] < arr[i]){
                    rank++;
                }
            }
            answer[i] = rank;
        }

        return answer;
    }

    public static void main(String[] args) {
        Cote02_08 an = new Cote02_08();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int [] arr = new int[num];
        sc.nextLine();

        for(int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }


        for(int x : an.soulution(num,arr)){
            System.out.print(x + " ");
        }

    }

}
