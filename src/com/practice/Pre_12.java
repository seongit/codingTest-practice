package com.practice;

import java.util.Scanner;

public class Pre_12 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[3]; // 한 사람이 3번 던지기 때문에 배열의 크기는 3
        int result = 0; // 결과값이 담기는 변수
        int sum = 1; // 같은눈이 누적되는 변수
        int price = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){

                arr[i] = sc.nextInt();
                result = arr[i];

                if(result == arr[i]) sum++;

                switch (sum){
                    case 1 :
                        if(result<arr[i]) result = arr[i];
                        price = result * 600;
                    case 2 :
                        price = 1000 + (result * 100);
                        break;
                    case 3 :
                        price = 10000 + (result * 1000);
                        break;
                }
            }
        }
        System.out.println(price);
    }
}
