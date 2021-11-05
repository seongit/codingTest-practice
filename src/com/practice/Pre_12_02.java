package com.practice;

import java.util.Scanner;

public class Pre_12_02 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 0;

        for(int i=0;i<n;i++){

            int a,b,c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            int r = 0;

            if(a==b && b==c){
                r = 10000 + 1000 * a;
            }else if(a==b && b!=c){
                r = 1000 + 100 * a;
            }else if(a==c && b!=c){
                r = 1000 + 100 * a;
            }else if(b==c && a!=b){
                r = 1000 + 100 * b;
            }else{
                if(a>b && a>c) r = 100*a;
                else if(b>a && b>c) r= 100*b;
                else r = 100 * c;
            }

            if(result<r){
                result = r;
            }
        }
        System.out.println(result);
    }
}
