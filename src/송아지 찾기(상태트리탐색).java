import java.util.*;
class Main7and8{
    static boolean check[] = new boolean[10001];
    static int dir[] = {-1,1,5};
    static int dis[] = new int[10001];

    public int BFS(int s, int e){

        Queue<Integer> q = new LinkedList<>();
        q.offer(s);
        check[s] = true;
        dis[s] = 0;

        while(!q.isEmpty()){
            int val = q.peek();
            q.poll();

            if(val == e){
                
                return dis[val];
            }

            for(int i=0;i<3;i++){
                int nextVal = val + dir[i];
                if(nextVal<1 || nextVal > 10000) continue;
                if(check[nextVal] != true){
                    check[nextVal] = true;
                    dis[nextVal] = dis[val] +1;
                    q.offer(nextVal);
                }
            }

        }
        return dis[e];
    }

    public static void main(String[] args){


        Main7and8 T = new Main7and8();
        Scanner I = new Scanner(System.in);

        int s = I.nextInt();
        int e = I.nextInt();

        System.out.print(T.BFS(s, e));

    }
}