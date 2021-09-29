import java.util.*;
class Main8and4{
    static int n,m;
    static int[] ret;
    public void DFS(int cnt, int[] arr){

        if(cnt==m){

            for(int i=0;i<m;i++)
                System.out.print(ret[i] + " ");

            System.out.println();

        }else{
            for(int i=0;i<n;i++){
                ret[cnt] = arr[i];
                DFS(cnt+1, arr);
            }
        }

    }

    public static void main(String[] args){

        Main8and4 t = new Main8and4();
        Scanner s = new Scanner(System.in);

        n = s.nextInt();
        m = s.nextInt();

        int[] arr = new int[n];
        ret = new int[m];

        for(int i=0;i<n;i++)
            arr[i] = i+1;

        t.DFS(0, arr);

    }

}