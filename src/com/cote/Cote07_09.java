package com.cote;


class Node3{
    Node3 lt,rt;
    int data;
    public Node3(int val){
        data = val;
        lt = rt = null;
    }
}

public class Cote07_09 {

    // 말단 노드가 아닌 중간 노드에 자식이 둘 다 있어야만 아래 로직으로 구현 가능
    // 중간 노드에 자식이 하나만 있을 경우 에러남

    Node3 root;

    public int DFS(int L, Node3 root){
        if(root.rt == null && root.lt == null)return L;
        else return Math.min(DFS(L+1,root.lt),DFS(L+1, root.rt));
    }

    public static void main(String[] args) {

        Cote07_09 tree = new Cote07_09();
        tree.root = new Node3(1);
        tree.root.lt = new Node3(2);
        tree.root.rt = new Node3(3);
        tree.root.lt.lt = new Node3(4);
        tree.root.lt.rt = new Node3(5);

        System.out.println(tree.DFS(0,tree.root));

    }


}
