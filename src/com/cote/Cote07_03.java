package com.cote;

public class Cote07_03 {

    public int DFS(int n){
        if (n==1)   return 1;
        else return n*DFS(n-1);
    }

    public static void main(String[] args) {
        Cote07_03 an = new Cote07_03();
        System.out.println(an.DFS(5));
    }
}
