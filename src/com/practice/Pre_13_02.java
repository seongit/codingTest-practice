package com.practice;

import java.util.Scanner;

public class Pre_13_02 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = sc.nextInt();

        int space = n-1;

        int currentFirst=0;
        int preFirst = 0;
        int preLast= 0;

        int number = 1;

        for(int i=1;i<=n;i++){

            // 공백 출력
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            space--;

            //짝수일 때
            if(i%2==0){
                currentFirst+=1;
                preFirst = currentFirst;
                for(int j=0;j<number;j++){
                    System.out.print(preFirst);
                    preLast = preFirst;
                    preFirst++;
                    if(preFirst>=10)preFirst=1;
                }
            }else{
                //홀수일 때
                if(i==1) currentFirst = s;
                else {

                }
                System.out.print(currentFirst);

            }
            number+=2;
            System.out.println();
        }

    }

}
