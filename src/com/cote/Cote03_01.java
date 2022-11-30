package com.cote;

import java.util.ArrayList;
import java.util.Scanner;

public class Cote03_01 {

    public ArrayList<Integer>solution(int num, int num2, int[]a, int[] b ){
        ArrayList<Integer>answer = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;

        // 둘 다 마지막 인덱스일 경우 반복문 종료
        // 그런데 둘 중 하나라도 먼저 종료될 경우는?
        while (p1<num && p2<num2){
           if(a[p1]<b[p2])answer.add(a[p1++]);
           else answer.add(b[p2++]);
        }
        while(p1<num)answer.add(a[p1++]);
        while(p2<num2)answer.add(b[p2++]);
        return answer;
    }

    public static void main(String[] args) {

        Cote03_01 an = new Cote03_01();

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int [] arr = new int[num];
        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt();
        }

        int num2 = sc.nextInt();
        int [] arr2 = new int[num2];

        for(int j=0; j<num2; j++){
            arr2[j] = sc.nextInt();
        }


        for(int x: an.solution(num,num2,arr,arr2)){
            System.out.print(x + " ");
        }

    }

}
