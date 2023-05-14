package com.cote;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point>{

    public int x,y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point p) {
        // 정렬 기준
        if(this.x == p.x) {
            return this.y - p.y; // x가 같을 경우 y값으로 비교
        } else {
            return this.x - p.x;
        }
    }
}

public class Cote06_07 {

    // 좌표 정렬

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Point> arr = new ArrayList<Point>();
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr.add(new Point(x,y));
        }

        Collections.sort(arr); // 내부적으로 Compareable 객체를 통해서 정렬함

        for(Point p : arr) System.out.println(p.x + " " + p.y );

    }
}
