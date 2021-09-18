import java.util.*;
class Main4and5{

    public int solution(int N,int K, int[] arr){
        int ans = -1;
        TreeSet<Integer> Tree = new TreeSet<>(Collections.reverseOrder());
        for(int i=0;i<N-2;i++){
            for(int j=i+1;j<N-1;j++){
                for(int x=j+1;x<N;x++){
                    int sum = arr[i] + arr[j] + arr[x];
                    Tree.add(sum);
                    
                }
            }
        }

        int cnt = 0;

        for(int i:Tree){
            cnt++;
            //System.out.println(i);
            if(cnt == K)
                return i;
        }


        return ans;
    }


    public static void main(String[] args){
        Main4and5 T = new Main4and5();
        Scanner S = new Scanner(System.in);

        int N = S.nextInt();
        int K = S.nextInt();

        int[] arr = new int[N];
        for(int i=0;i<N;i++)
            arr[i] = S.nextInt();

        System.out.print(T.solution(N, K, arr));


    }
}