package com.cote;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Cote07_08 {

    int answer = 0;
    int [] dis = {1,-1,5};
    int [] ch; // check 배열

    Queue<Integer> Q = new LinkedList<>();

    public int BFS(int s, int e){
        ch = new int[10001];
        ch[s]=1; // 출발 지점 세팅
        Q.offer(s);

        int L = 0; // 루트 노드 레벨 값

        while(!Q.isEmpty()){ // 비어있을 때 멈춰야 함

            int len = Q.size();

            for(int i=0; i<len; i++){
                int x = Q.poll() ; // 부모 노드를 X에 담기
                for(int j=0; j<3; j++){
                    int nx = x + dis[j]; // 자식 노드 담기
                    if(nx >= 1 && nx <= 10000 && ch[nx] == 0 ){
                        // Q에 중복된 데이터는 담지 않기 위해 조건식
                        if(nx == e) return L+1;
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {

        Cote07_08 an = new Cote07_08();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(an.BFS(s,e));

    }


}
