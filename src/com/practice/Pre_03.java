package com.practice;
import java.io.IOException;
import java.util.Scanner;

public class Pre_03 {

    public static void main(String[]args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int answer = 0;

        if(answer < a) {
            answer = a;
        }
        if (answer < b){
            answer = b;
        }
        if(answer < c){
            answer = c;
        }
        System.out.println(answer);
    }
}
