package com.cote;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Cote07_13 {

    static int n,m,answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch,dis;

    public void BFS(int v){

        Queue<Integer> queue = new LinkedList<>();

        dis[v] = 0;
        ch[v] = 1;

        queue.offer(v);

        while(!queue.isEmpty()){

            int cv = queue.poll(); // 현재 정점
            for(int nv : graph.get(cv)){ // 인접 리스트 순회
                if(ch[nv]==0){ // 인접 리스트 방문 여부 확인
                    ch[nv] = 1;
                    queue.offer(nv);
                    dis[nv] = dis[cv] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {

        Cote07_13 an = new Cote07_13();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();

        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<>());
        }

        ch = new int[n+1];
        dis = new int[n+1];

        // 인접 리스트 만들기
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }

        an.BFS(1);
        for(int i=2; i<=n ;i++){
            System.out.println(i+" "+dis[i]);
        }

    }

}
