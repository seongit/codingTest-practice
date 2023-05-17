package com.cote;

public class Cote07_01 {

    public void DFS(int n){
        if(n==0) return;
        else{
            DFS(n-1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {

        // 재귀함수는 스택 프레임을 사용한다.
        Cote07_01 an = new Cote07_01();
        an.DFS(3);

    }

}
