package com.cote;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Cote03_02 {

    public ArrayList<Integer> soultion(int n, int m, int[]a, int[]b){
        ArrayList<Integer>answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        Arrays.sort(a);
        Arrays.sort(b);

        while(p1 < n && p2 < m){
            if(a[p1]==b[p2]) {
                answer.add(a[p1++]);
                p2++;
            }else if(a[p1] > b[p2]) {
                p2++;
            }
            else p1++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Cote03_02 an = new Cote03_02();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0; i<n;i++){
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int [] b = new int[m];
        for(int j=0; j<m; j++){
            b[j] = sc.nextInt();
        }

        for(int x : an.soultion(n,m,a,b)){
            System.out.print(x+" ");
        }


    }

}
