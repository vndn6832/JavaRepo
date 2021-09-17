import java.util.*;
class Main2and2 {

    public int solution(int n, int[] arr){
        int ans = 0;
        int max = arr[0];
        ans++;

        for(int i=1;i<n;i++){
            if(max < arr[i]){
                ans++;
                max = arr[i];
            
            }
        }

        return ans;
    }
    public static void main(String[] args){
        Main2and2 T = new Main2and2();
        Scanner S = new Scanner(System.in);

        int N = S.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = S.nextInt();
        }

        System.out.print(T.solution(N, arr));

        
    }

}
