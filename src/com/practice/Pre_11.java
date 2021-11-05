package com.practice;

import java.util.Scanner;

public class Pre_11 {
    // 통과
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int [] aArr = new int[10];
        int aCount = 0;

        int [] bArr = new int[10];
        int bCount = 0;

        for(int i=0;i<10;i++){
            aArr[i] = sc.nextInt();
        }

        for(int i=0;i<10;i++){
            bArr[i] = sc.nextInt();
        }

        for(int i=0;i<10;i++){
            //System.out.print(aArr[i] + " ");
            //System.out.println(bArr[i] + " ");
            // a가 더 큰 경우
            if(bArr[i]<aArr[i]) aCount++;
            // b가 더 큰 경우
            if(aArr[i]<bArr[i]) bCount++;
        }

        if(bCount<aCount) System.out.println("A");
        if(aCount<bCount) System.out.println("B");
        if(aCount==bCount) System.out.println("D");

    }
}
