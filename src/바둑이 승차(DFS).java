import java.util.*;
class Main8and2{


    static int c;
    static int n;
    static int[] arr;
    static int ans = 0;

    public void DFS(int idx, int sum){

        if(sum>c) return;
        if(idx==n){
            ans = Math.max(ans,sum);
        }else{
            DFS(idx+1, sum+arr[idx]);
            DFS(idx+1, sum);
        }

    }



    public static void main(String[] args){

        Main8and2 t = new Main8and2();
        Scanner s = new Scanner(System.in);

        c = s.nextInt();
        n = s.nextInt();


        arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }

        t.DFS(0,0);

        System.out.println(ans);

    }

}