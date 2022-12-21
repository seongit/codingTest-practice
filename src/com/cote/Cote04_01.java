package com.cote;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Cote04_01 {

    public char solution(int n, String str){
        char answer = ' ';
        HashMap<Character,Integer> map = new HashMap<>();
        for(char x : str.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        int max = Integer.MIN_VALUE;

        for(char key : map.keySet()){
            // value 중 가장 큰 값의 key를 찾아봐야함
            if(map.get(key) > max){
                max = map.get(key);
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Cote04_01 an = new Cote04_01();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        System.out.println(an.solution(n,str));
    }

}
