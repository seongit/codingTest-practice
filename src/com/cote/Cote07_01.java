package com.cote;

public class Cote07_01 {

    public void DFS(int n){
        // if ~ else 구조로 잡기
        if(n==0) return; // void에서 return을 사용할 경우 함수 종료의 의미도 갖음 (재귀 멈추는 구간)
        else{
            // 출력문 위치에 따라 찍히는 값 달라짐 (*중요)
            // 출력문이 앞에 있는 경우 결과 : 3 2 1
            System.out.print("오잉" + n + " ");
            DFS(n-1);
            // 출력문이 뒤에 있는 경우 결과 : 1 2 3
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {

        // 재귀함수는 스택 프레임을 사용한다.
        Cote07_01 an = new Cote07_01();
        an.DFS(3);

    }

}
