import java.util.*;
class Main8and3{

    static int n,m;
    static int[][] arr;
    static int ans = 0;

    public void DFS(int idx, int sum, int time){

        if(time>m) return;
        if(idx ==n){
            ans = Math.max(ans, sum);

        }else{

            DFS(idx+1, sum+arr[idx][0], time+arr[idx][1]);
            DFS(idx+1, sum,time);

        }

    }

    public static void main(String[] args){

        Main8and3 t = new Main8and3();
        Scanner s = new Scanner(System.in);

        n = s.nextInt();
        m = s.nextInt();

        arr = new int[n][2];

        for(int i=0;i<n;i++){
            int a = s.nextInt();
            int b = s.nextInt();

            arr[i][0] = a;
            arr[i][1] = b;
        }

        t.DFS(0,0,0);

        System.out.println(ans);

    }
}