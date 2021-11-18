package com.practice;

import java.util.Scanner;

public class SBF_box {
    public static void main(String[]args){

        // 하나의 색은 최대 두 번 사용 가능하다 < 가장 중요한 관찰
        // 실제로 쓸 수 있는 색의 수는? -> 핵심
        // 같은 숫자가 3번 이상 나오면 실제로 쓸 수 있는 색의 수를 지운다.
        // 만약 6개이상이라면 칠할 수 있지만, 6개 미만이면 칠할 수 없다.

        // 각각 입력한 색의 개수를 센다.
        // 각각의 색깔에 대해서 실제로 활용할 수 있는 색깔의 개수를 센다.
        // 그 값을 validColor에 더해준다.
        // 만약 validColor가 2이상이라면 2개만 사용할 수 있고,
        // 2개 미만이라면 validColor에 cnt[i]를 더해준다.

        // -> 실제로 활용할 수 있는 색의 개수가 나온다.

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [] arr = new int[1005];
        for(int i=0;i<num;i++){
            int a = sc.nextInt();
            arr[a]++;
        }

        int validColor = 0; // 사용   가능한 색깔의 총 개수를 구하는 변수
        for(int i=1;i<=num;i++){
            // i번 색깔을 몇 개 쓸 수 있는가?
            if(arr[i]<2) validColor+=arr[i];
            else{
                validColor+=2;
            }
        }

        if(validColor>=6){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
