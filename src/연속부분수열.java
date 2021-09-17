import java.util.*;
class Main3and4{

    public int solution(int N, int M , int[] arr){
        int cnt = 0;

        int lt=0,rt=0;

        int sum =arr[0];
        while(lt<N && rt <N){
            
     
            if(sum < M){
                rt++;
                if(rt>=N) break;
                    sum += arr[rt];
            }else{
                if(sum == M)
                    cnt++;
                sum -= arr[lt];
                lt++;
            }
        }

        return cnt;

    }

    public static void main(String[] args){
        Main3and4 T = new Main3and4();
        Scanner S = new Scanner(System.in);

        int N = S.nextInt();
        int M = S.nextInt();

        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = S.nextInt();
        }

        System.out.print(T.solution(N, M, arr));
        S.close();

    }
}