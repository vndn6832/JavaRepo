import java.util.*;
class Main3and6{

    public int solution(int n, int k, int[] arr){
        int max = 0;

        int lt =0;
        int zero =0;
        for(int rt=0;rt<n;rt++){
            if(arr[rt] ==0) zero++;
            while(zero>k){
                if(arr[lt] ==0) zero--;
                lt++;
            }
            max = Math.max(max,rt-lt+1);
            
        }

        return max;

    }

    public static void main(String[] args){
        Main3and6 T = new Main3and6();
        Scanner S = new Scanner(System.in);

        int n = S.nextInt();
        int k = S.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = S.nextInt();
        }

        System.out.print(T.solution(n, k, arr));
        
    }
}