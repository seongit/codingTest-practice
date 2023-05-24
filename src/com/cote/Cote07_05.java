package com.cote;

class Node {
    int data;
    Node lt,rt;
    public Node(int value){
        data = value;
        lt=rt=null;
    }

}

public class Cote07_05 {

    Node root;
    public void DFS(Node root){
        // 말단 노드는 lt,rt 값이 null이다.
        if(root == null) return;
        else {
            // 전위순회
            // System.out.print(root.data + " ");
            DFS(root.lt);
            //중위 순회
            // System.out.print(root.data + " ");
            DFS(root.rt);
            // 후위 순회
            // System.out.print(root.data + " ");
        }

    }

    public static void main(String[] args) {
        Cote07_05 tree = new Cote07_05();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);
    }

}
