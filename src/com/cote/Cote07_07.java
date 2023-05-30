package com.cote;

import java.util.LinkedList;
import java.util.Queue;

class Node2{
    int data;
    Node2 lt, rt;
    public Node2(int value){
        data = value;
        lt = rt = null;
    }
}


public class Cote07_07 {

    Node2 root;

    public void BFS(Node2 root){

        Queue<Node2> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0; // root node level is 0
        while(!Q.isEmpty()){
            int len = Q.size(); // Q의 원소 개수
            System.out.print(L + " : ");
            for(int i=0; i<len; i++){
                Node2 cur = Q.poll(); // 현재 노드 꺼내기
                System.out.print(cur.data + " ");
                if(cur.lt != null) Q.offer(cur.lt); // 왼쪽 자식을 큐에 넣음
                if(cur.rt != null) Q.offer(cur.rt); // 오른쪽 자식을 큐에 넣음
            }
            L++; // 레벨 증가
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Cote07_07 tree = new Cote07_07();
        tree.root = new Node2(1);
        tree.root.lt = new Node2(2);
        tree.root.rt = new Node2(3);
        tree.root.lt.lt = new Node2(4);
        tree.root.lt.rt = new Node2(5);
        tree.root.rt.lt = new Node2(6);
        tree.root.rt.rt = new Node2(7);
        tree.BFS(tree.root);
    }


}
