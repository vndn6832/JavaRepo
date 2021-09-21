import java.util.*;
class Main6and5{

    public char solution(int n, int[] arr){
        char ans = 'U';
        Arrays.sort(arr);
        
        for(int i=0;i<n-1;i++){
            if(arr[i] == arr[i+1])
                return 'D';
        }

        return ans;
    }

    public static void main(String[] args){
        Main6and5 T = new Main6and5();
        Scanner S = new Scanner(System.in);

        int n = S.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = S.nextInt();
        }

        System.out.print(T.solution(n, arr));
    }
}