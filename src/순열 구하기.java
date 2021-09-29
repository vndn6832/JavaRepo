import java.util.*;
class Main8and6{

    static int n,m;
    static boolean[] check;
    static int[] arr;
    static int[] ret;

    public void dfs(int cnt){
        if(cnt == m){
            for(int i=0;i<m;i++)
                System.out.print(ret[i] + " ");

            System.out.println();
            
        }else{
            for(int i=0;i<n;i++){
                if(check[i] != true){
                    check[i] = true;
                    ret[cnt] = arr[i];
                    dfs(cnt+1);
                    check[i] = false;
                }
            }
        }
    }


    public static void main(String[] args){

        Main8and6 t = new Main8and6();
        Scanner s = new Scanner(System.in);

        n = s.nextInt();
        m = s.nextInt();

        arr = new int[n];

        check = new boolean[n];
        ret = new int[m];

        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }


        t.dfs(0);

    }
}