package com.practice;

import java.util.Scanner;

public class Pre_02_02 {
    public static void main(String[]args){

        // 배를 int로 초기화한다.
        int upSide= 0;

        // 배열 생성
       String[] arr = new String[4];
       int size = arr.length;

       // 4개의 입력 값을 받는다.
       Scanner sc = new Scanner(System.in);


       // 하나의 배열에 입력 값을 담는다.
       for(int i=0;i<size;i++){
        arr[i] = sc.next();
       }

       // 반복문을 배열의 길이만큼 돌려서 0의 개수를 구한다.
       for(int i=0; i<size;i++){
           if(arr[i].equals("0")){
               upSide++;
           }
       }

        System.out.println(upSide);

       // 0의 개수에 따라 하나의 결과를 출력한다.
       switch (upSide%10){
           case 1 :
               System.out.println("A"); break;
           case 2 :
               System.out.println("B"); break;
           case 3 :
               System.out.println("C"); break;
           case 4 :
               System.out.println("D"); break;
           default:
               System.out.println("E");break;
       }

    }

}
