import java.util.*;
class Main5and6{
    public int solution(int N, int K){
        int ans=0;
        Queue<Integer> q = new LinkedList<>(); //큐 선언
        for(int i=1;i<=N;i++){
            q.offer(i); // 값 넣기
        }

        /*
        int cnt = 0;
        while(q.size()>1){
            int x = q.peek(); 
            q.poll();
            cnt++;

            if(cnt == K){
                cnt = 0;
            }else{
                q.offer(x);
            }

        }
        ans = q.peek();
        */

        while(!q.isEmpty()){
            for(int i=1;i<K;i++) q.offer(q.poll());
            q.poll();
            if(q.size()==1) ans = q.poll();
        }

        return ans;
    }

    public static void main(String[] args){
        Main5and6 T = new Main5and6();
        Scanner S = new Scanner(System.in);

        int N = S.nextInt();
        int K = S.nextInt();

        System.out.print(T.solution(N,K));

    }
}