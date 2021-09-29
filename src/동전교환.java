import java.util.*;
class Main8and5{
    static int ans = Integer.MAX_VALUE;
    static int n,val;
    public void DFS(int cnt, int sum, Integer[] arr){
        
        if(cnt>=ans) return;
        if(sum > val) return;
        if(sum==val){
            ans = Math.min(ans,cnt);
        }else{
            for(int i=0;i<n;i++){
                DFS(cnt+1,sum+arr[i], arr);
            }
        }

    }


    public static void main(String[] args){
        Main8and5 t = new Main8and5();
        Scanner s = new Scanner(System.in);

        n = s.nextInt();

        Integer[] arr = new Integer[n];

        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
    
        Arrays.sort(arr,Collections.reverseOrder());

        val = s.nextInt();

        t.DFS(0, 0, arr);
        System.out.println(ans);
    }

}