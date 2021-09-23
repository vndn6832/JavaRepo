import java.util.*;
class Main7and12{
    static int cnt = 0;
    static int[][] arr;
    static boolean[] check;
    static ArrayList<Integer> dis;
    public void DFS(int v,int e){
        if(v==e){
            cnt++;
        }else{
            for(int i=1;i<=e;i++){
                if(arr[v][i] == 1 &&check[i] == false){
                        check[i] = true;
                        DFS(i,e);
                        check[i] = false;
                    
                }
            }
        }


    }
    public static void main(String[] args){

        Main7and12 T = new Main7and12();
        Scanner S = new Scanner(System.in);
        
        int n = S.nextInt();
        int m = S.nextInt();
        arr = new int[n+1][n+1];
        check = new boolean[n+1];

        for(int i=0;i<m;i++){
            int a = S.nextInt();
            int b = S.nextInt();

            arr[a][b] =1;
        }

      

        check[1] = true; //***
        T.DFS(1,n);

        for(int i=0;i<=n;i++)
            System.out.println("check " + i + " : " + check[i]);

        System.out.print(cnt);

    }


}
