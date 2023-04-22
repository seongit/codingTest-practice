package com.cote;

import java.util.Scanner;
import java.util.Stack;

public class Cote05_03_01 {

    public int solution(int[][] board, int[] moves){
        int answer = 0;

        Stack <Integer> stack = new Stack<>();

        // moves 배열에 담긴 순서대로 크레인의 위치를 돈다.
        for(int pos : moves){
            // board 배열을 길이만큼 크레인이 내려감
            for(int i=0; i<board.length; i++){
                // 인형을 발견한 경우 tmp에 인형 변호를 담음
                if(board[i][pos-1] != 0){
                    int tmp = board[i][pos-1];
                    // 인형을 꺼낸 경우 해당 요소의 값은 0으로 초기화
                    board[i][pos-1] = 0;
                    // tmp와 stack의 첫번째 요소를 비교 (peek)
                    if(!stack.isEmpty() && tmp == stack.peek()){
                        // tmp와 stack의 첫번째 요소가 같을 경우 (pop & answer += 2)
                        answer += 2;
                        stack.pop();
                    }else stack.push(tmp);   // tmp와 stack의 첫번재 요소가 다를 경우 (push(tmp))
                    // 인형을 찾은 경우 크레인이 더이상 내려가지 않도록 break
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Cote05_03_01 answer = new Cote05_03_01();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // borad 크기 입력 받음
        int [][] board = new int[n][n]; // n크기 짜리의 board 배열 생성
        for(int i=0; i < board.length; i++){
            for(int j=0; j < board.length; j++){
                board[i][j] = sc.nextInt();
            }
        }

        // moves 배열 크기 입력 받음
        int m = sc.nextInt();
        int [] moves = new int[m];
        for(int i=0; i < moves.length; i++){
            moves[i] = sc.nextInt();
        }

        System.out.println(answer.solution(board,moves));

    }

}

