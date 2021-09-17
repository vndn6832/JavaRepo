import java.util.*;
class Main2and8{

    public int[] solution(int n, int[] arr){
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            int cnt = 1;
            for(int j=0;j<n;j++){
                if(arr[j] > arr[i] )
                    cnt++;
            }

            ans[i] = cnt;
        }

        return ans;
    }


    public static void main(String[] args){

        Main2and8 T = new Main2and8();
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = S.nextInt();
        }

        for(int i: T.solution(n, arr))
            System.out.print(i+ " ");
        
    }
}
