package com.cote;

import java.util.Scanner;

public class Cote01_05 {


    // 1. 문자열을 입력 받는다.
    public static void main(String[] args) {

        Cote01_05 an = new Cote01_05();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(an.solution(str));

    }

    public String solution(String str){
        String answer = "";

        // 2. 입력한 문자열을 문자배열로 변경한다.
        char [] arr = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;
        // 3. 반복문에서 배열을 돈다.
        while(lt < rt){
            // 3-1. i번째 인덱스의 알파벳을 찾는다.
            // 3-1. arr[lt]가 특수문자가 아니면? lt++
            if (!Character.isAlphabetic(arr[lt])) lt++;
            else if(!Character.isAlphabetic(arr[rt])) rt--;
            else{
                // 4. i번째 인덱스가 알파벳이라면?
                // 4-1. i[lt], i[rt] 를 교환한다.
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(arr);
        return answer;
    }

}
