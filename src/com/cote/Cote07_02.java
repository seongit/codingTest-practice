package com.cote;

public class Cote07_02 {

    public void DFS(int n){
        if(n==0) return ;
        else{
            DFS(n/2);
            System.out.print (n%2+" ");
        }
    }

    public static void main(String[] args) {
        Cote07_02 an = new Cote07_02();
        an.DFS(11);
    }
}
