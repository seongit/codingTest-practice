package com.cote;

public class Cote07_04 {

    static int [] fibo;

    public int DFS(int n){

        if(fibo[n]>0) return fibo[n]; // 배열에 값이 있는 경우 재귀하지 않고 해당 값을 리턴
        if(n==1 || n==2) return fibo[n] = 1 ; // n이 1또는 2일 경우
        else return fibo[n] = DFS(n-2) + DFS(n-1);
    }

    public static void main(String[] args) {
        Cote07_04 an = new Cote07_04();
        int n = 45;
        fibo = new int[n+1]; // 0번째 인덱스는 사용하지 않을 것이기 때문에 n+1
        an.DFS(n);
        for(int i=1; i<=n; i++){
            System.out.print (an.DFS(i) + " ");
        }
    }

}
