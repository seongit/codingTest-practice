package com.practice;

import java.util.Scanner;

public class Pre_13_02 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = sc.nextInt();

        int space = n-1;

        int currentFirst=0;
        int preFirst = s;
        int preLast = 0;

        int number = 1;

        for(int i=1;i<=n;i++){
            // 공백 출력
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            space--;

            //짝수일 때
            if(i%2==0){
                currentFirst = preFirst + 1;
                if(currentFirst>=10)currentFirst=1;

                for(int j=0;j<number;j++){
                    System.out.print(currentFirst);
                    preLast = currentFirst;
                    currentFirst+=1;
                    if(currentFirst>=10)currentFirst=1;
                }
            }else{
                //홀수일 때
                if(i==1) currentFirst = s;
                else {
                    currentFirst = preLast;
                    // 7,8,9,1,2로 currentFirst의 값이 변경되고, 최종 currentFirst의 값은 2이다.
                    for(int j=0;j<number;j++){
                        currentFirst+=1;
                        if(currentFirst>=10)currentFirst=1;
                    }
                }
                preFirst = currentFirst;
                for(int j=0;j<number;j++){
                    System.out.print(currentFirst);
                    currentFirst-=1;
                    if(currentFirst<=0)currentFirst=9;
                }
            }
            number+=2;
            System.out.println();
        }

    }

}
