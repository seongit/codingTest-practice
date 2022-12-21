package com.cote;

import java.util.HashMap;
import java.util.Scanner;

public class Cote04_02 {

    public String solution(String s, String m){
        String answer = "YES";

        HashMap<Character,Integer> map = new HashMap<>();

        for(char x : s.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        for(char key : m.toCharArray()){
            if(!map.containsKey(key) || map.get(key)==0) return "NO";
            map.put(key,map.get(key)-1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Cote04_02 an = new Cote04_02();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        System.out.println(an.solution(s,t));


    }

}
