import java.util.*;
class Main8and7{

    int[][] dy = new int[34][34];

    public int DFS(int n, int r){
        if(dy[n][r]>0) return dy[n][r];
        
        if(n==r || r==0) return 1;
        else
            return dy[n][r] = DFS(n-1,r-1) +  DFS(n-1,r);
    }


    public static void main(String[] args){
        Main8and7 t = new Main8and7();
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int r = s.nextInt();

        System.out.print(t.DFS(n,r));

    }
}