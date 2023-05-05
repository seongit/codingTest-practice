package com.cote;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person{
    int id;
    int priority;
    public Person(int id, int priority){
        this.id = id;
        this.priority = priority;
    }
}


public class Cote05_08 {

    public int solution(int n, int m, int[]arr){
        int answer = 0;
        Queue<Person> Q = new LinkedList<>();
        for(int i=0; i<arr.length; i++){
            // Q에 person 객체 넣기
            Q.offer(new Person(i,arr[i]));
        }

        while(!Q.isEmpty()){
            Person tmp = Q.poll();
            for(Person x : Q){
                if(x.priority > tmp.priority) {
                    Q.offer(tmp); // 대기줄의 우선순위보다 tmp의 우선순위가 작을 경우 다시 큐에 담음
                    tmp = null;
                    break;
                }
            }

            if(tmp != null){
                answer++;
                if(tmp.id == m) return answer;
            }

        }

        return answer;
    }


    public static void main(String[] args) {
        Cote05_08 an = new Cote05_08();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(an.solution(n,m,arr));

    }

}
