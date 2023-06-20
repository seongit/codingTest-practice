package com.cote;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Cote07_11 {

    static int n, m, answer = 0;
    static int [][] graph;
    static int [] ch;
    public void DFS(int v){
        if(v == n) answer ++;
        else {
            for(int i=1; i<=n; i++){
                if(graph[v][i] == 1 && ch[i] == 0){
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0; // 체크 풀어줘야 함
                };
            }
        }
    }

    public static void main(String[] args) {
        Cote07_11 an = new Cote07_11();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 노드, 정점의 개수
        m = sc.nextInt(); // 간선의 개수
        graph = new int[n+1][n+1];
        ch = new int[n+1];
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }
        ch[1] = 1;
        an.DFS(1);
        System.out.println(answer);
    }

}
