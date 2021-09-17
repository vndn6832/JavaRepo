import java.util.*;

class Main2and4{
    
    public int[] solution(int n){

        int[] ans = new int[n];
        
        ans[0] = 1;
        ans[1] = 1;

        for(int i=2;i<n;i++){
            ans[i] = ans[i-2] + ans[i-1];
        }

        return ans;
    }

    public static void main(String[] args){
        Main2and4 T = new Main2and4();
        Scanner S = new Scanner(System.in);

        int n = S.nextInt();

        for(int i: T.solution(n))
            System.out.print(i + " ");

    }
}
