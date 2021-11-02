package com.practice;

import java.util.Scanner;

public class Pre_02_01 {

    // 윷의 상태를 입력 받는다.
    // 배의 개수와 등의 개수를 구한다.
    // 배의 개수와 등의 개수에 대해 결과를 출력한다.

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int bae = 0;

        if(a==0)bae++;
        if(b==0)bae++;
        if(c==0)bae++;
        if(d==0)bae++;

        if(bae == 1) System.out.println("A");
        if(bae == 2) System.out.println("B");
        if(bae == 3) System.out.println("C");
        if(bae == 4) System.out.println("D");
        if(bae == 0) System.out.println("E");

    }
}
