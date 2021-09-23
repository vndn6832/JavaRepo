import java.util.*;
class Main7and14{
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] check;
    static int[] dis;
    static int n,m,ans;
    public void BFS(){

        Queue<Integer> q = new LinkedList<>();

        q.offer(1);
        check[1] = true;
        dis[1] = 0;

        while(!q.isEmpty()){
            int v = q.poll();

            for(int nv: graph.get(v)){
                if(check[nv] != true){
                    check[nv] = true;
                    dis[nv] = dis[v] +1;
                    q.offer(nv);
                }
            }
        }


    }

    public static void main(String[] args){
        Main7and14 T = new Main7and14();
        Scanner S = new Scanner(System.in);

        n = S.nextInt();
        m = S.nextInt();

        graph = new ArrayList<ArrayList<Integer>>();
        check = new boolean[n+1];
        dis = new int[n+1];

        for(int i=0;i<=n;i++){

            graph.add(new ArrayList<Integer>());
        }

        for(int i=0;i<m;i++){
            int a = S.nextInt();
            int b = S.nextInt();

            graph.get(a).add(b);
        }

        T.BFS();

        for(int i=2;i<=n;i++){
            System.out.println(i+" : "+ dis[i]);
        }
    }


}