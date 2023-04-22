package com.cote;

import java.util.Scanner;
import java.util.Stack;

public class Cote05_03 {

    public int solution(int[][]board, int[] moves){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        // moves 탐색
        // pos는 크레인 위치 (좌->우로 이동)
        for(int pos : moves){
            // 크레인이 내려가며 인형을 발견해야함 (상 -> 하로 이동)
            for(int i=0; i<board.length; i++){
                // i배열의 요소가 0이 아닐 경우 = 인형이 발견된 경우
                if(board[i][pos-1] != 0){
                    int tmp = board[i][pos-1]; // tmp에 인형 번호를 넣음
                    board[i][pos-1] = 0; // 인형을 가져왔기 때문에 0으로 변경
                    // 가져온 인형이 stack의 상단의 인형과 같은지 비교한다 (peek 사용)
                    // 같다면 pop 시키고
                        // 같지 않다면 push할 것
                    if(!stack.isEmpty() && tmp == stack.peek()){
                        answer += 2;
                        stack.pop();
                    }else stack.push(tmp);
                    // 인형이 발견된 경우에는 break로 인형을 더이상 뽑으면 안됨
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Cote05_03 answer = new Cote05_03();
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int board[][] = new int[n][n];
        for(int i=0; i<board.length; i++){
            for(int j=0; j< board.length; j++){
                board[i][j] = sc.nextInt();
            }
        }

        int m = sc.nextInt();
        int[] moves = new int[m];
        for(int i=0; i<moves.length; i++){
            moves[i] = sc.nextInt();
        }

        System.out.println(answer.solution(board,moves));

    }

}
