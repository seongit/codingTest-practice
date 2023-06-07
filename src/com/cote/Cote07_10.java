package com.cote;

import java.util.LinkedList;
import java.util.Queue;

class Node4{
    Node4 lt,rt;
    int data;
    Node4(int val){
        data = val;
        lt = rt = null;
    }

}

public class Cote07_10 {
    // BFS는 중간 노드의 자식이 하나라도 에러가 발생하지 않는다.

    Node4 root;

    public int DFS(Node4 root){

        Queue<Node4> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while (!Q.isEmpty()){
            int len = Q.size();
            for(int i=0; i<len; i++){
                Node4 cur = Q.poll();
                if(cur.lt == null && cur.rt == null) return L; // 말단 노드인 경우
                if(cur.lt != null) Q.offer(cur.lt);
                if(cur.rt != null) Q.offer(cur.rt);
            }
            L++;
        }

        return 0;
    }

    public static void main(String[] args) {

        Cote07_10 tree = new Cote07_10();
        tree.root = new Node4(1);
        tree.root.lt = new Node4(2);
        tree.root.rt = new Node4(3);
        tree.root.lt.lt = new Node4(4);
        tree.root.lt.rt = new Node4(5);
        System.out.println(tree.DFS(tree.root));

    }


}
