package com.practice;

import java.util.Scanner;

public class Classpresident {

    public static void main(String[] args) {

        int[][] student = new int[1005][5];
        int n=0;
        int result = -1; // 겹치는 학생의 수
        int resultNum = 0; // 학생의 번호

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0; j<5;j++){
                // i와 j가 같은 반 인 적이 있었는가?
                student[i][j] = sc.nextInt();
            }
            // student[i] => i번 학생의 반 정보
        }

        for(int i=1;i<=n;i++){
            // i번 학생에 대해서, 겹치는 학생의 숫자를 구한다.
            int numStudent = 0; // 겹치는 학생의 수
            for(int j=1;j<=n;j++){
                // i와 j가 같은반이었던 적이 있었는지를 판별한다.
                if(i == j) continue;

                if(student[i][0] == student[j][0]  ||
                    student[i][1] == student[j][1] ||
                    student[i][2] == student[j][2] ||
                    student[i][3] == student[j][3] ||
                    student[i][4] == student[j][4])
                    numStudent++ ;
            }
            // i번 학생과 겹치는 학생의 수
            if( result < numStudent){
                result = numStudent;
                resultNum = i;
            }
        }
        System.out.println(resultNum);
    }
}
