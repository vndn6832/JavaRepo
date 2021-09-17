import java.util.*;
class Main2and1{

    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arr[0]);
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1])
                ans.add(arr[i]);
        }

        return ans;
    }


    public static void main(String[] args){
        Main2and1 T = new Main2and1();
        Scanner S = new Scanner(System.in);

        int N = S.nextInt();

        int[] arr = new int[N];

        for(int i=0;i<N;i++){
            arr[i] = S.nextInt();
        }

        for(int x: T.solution(N,arr)){
            System.out.print(x+ " ");
        }


    }
}