import java.util.*;
class Main5and3{

    public int solution(int N, int[][] arr, int M, int[] move){
        int cnt =0;
        Stack<Integer> stk = new Stack<>();
        for(int i=0;i<M;i++){
            int num = move[i]-1;
            for(int j=0;j<N;j++){
                if(arr[j][num] != 0){
                    if(!stk.empty() && stk.peek() == arr[j][num]){
                        //System.out.println(" " + stk.peek());
                        cnt+=2;
                        stk.pop();
                    }else{
                        stk.push(arr[j][num]);
                    }
                    arr[j][num] = 0;
                    break; //*** 가장 위에 있는 하나만!!!
                }
            }

        }
        return cnt;
    }

    public static void main(String[] args){
        Main5and3 T = new Main5and3();
        Scanner S = new Scanner(System.in);

        int N = S.nextInt();
        int[][] arr = new int[N][N];

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                arr[i][j] = S.nextInt();
            }
        }

        int M = S.nextInt();
        int[] move = new int[M];

        for(int i=0;i<M;i++)
            move[i] = S.nextInt();
        
        System.out.print(T.solution(N, arr, M, move));

    }
}