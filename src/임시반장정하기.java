import java.util.Scanner;

import java.util.*;
class Main2and11{

    public int solution(int n, int[][] arr){

        int max = Integer.MIN_VALUE;
        int ans = 0;
        for(int i=1;i<=n;i++){
            int cnt = 0;
            for(int j=1;j<=n;j++){
                
                for(int k=1;k<=5;k++){
                    if(arr[i][k] == arr[j][k]){
                         cnt++;
                         break; //*** 한번만 카운트 하면됨 - 한번이라도 같은 반이었던 사람 찾는거니깐
                    }
                }
                
            }
            if(cnt > max){
                    max = cnt;
                    ans = i;
            }
        }

        return ans;
    }




    public static void main(String[] args){
        Main2and11 T = new Main2and11();
        Scanner S = new Scanner(System.in);

        int n = S.nextInt();
        int arr[][] = new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=5;j++){ //5학년 까지
                arr[i][j] = S.nextInt();
            }
        }

        System.out.print(T.solution(n,arr));
        S.close();

    }
}