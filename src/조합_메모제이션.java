import java.util.*;
class Memo{
    int[][] dy = new int [35][35];
    public int DFS(int n, int r){
        if(dy[n][r]>0) return dy[n][r];
        if(n==r || r==0) return 1;
        else return dy[n][r] = DFS(n-1,r) + DFS(n-1,r-1);
    }

    public static void main(String[] args){
        Memo t = new Memo();

        Scanner s = new Scanner(System.in);

        int n=s.nextInt();
        int r=s.nextInt();
        System.out.print(t.DFS(n,r));
    }
}