import java.util.*;
class Main7and13{
    static ArrayList<ArrayList<Integer>> arr;
    static boolean[] check;
    static int n,m,ans;

    public void DFS(int v){
        if(v==n){
            ans++;
        }else{
            /*
            for(int i=0;i<arr.get(v).size();i++){
                if(check[arr.get(v).get(i)] != true){
                    check[arr.get(v).get(i)] = true;
                    DFS(arr.get(v).get(i));
                    check[arr.get(v).get(i)] = false;
                }
            }
            */
            
            for(int i : arr.get(v)){
                if(check[i] != true){
                    check[i] = true;
                    DFS(i);
                    check[i] = false;
                }
            }
        }

    } 
    public static void main(String[] args){

        Main7and13 T = new Main7and13();
        Scanner S = new Scanner(System.in);

        n = S.nextInt();
        m = S.nextInt();

        arr = new ArrayList<ArrayList<Integer>>();
        check = new boolean[n+1];

        for(int i=0;i<=n;i++){ //get할 때를 위해서 0부터 n까지
            arr.add(new ArrayList<Integer>()); //***
        }

        

        for(int i=0;i<m;i++){
            int a = S.nextInt();
            int b = S.nextInt();
            arr.get(a).add(b);

        }

        check[1] = true;
        T.DFS(1);
        System.out.print(ans);

    }

}