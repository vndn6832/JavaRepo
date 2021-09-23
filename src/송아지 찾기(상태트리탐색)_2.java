import java.util.*;
class Main7and8and2{
    static boolean check[] = new boolean[10001];
    static int dir[] = {-1,1,5};

    public int BFS(int s, int e){

        Queue<Integer> q = new LinkedList<>();
        q.offer(s);
        check[s] = true;
        int L=0; //레벨

        while(!q.isEmpty()){
            int len = q.size(); //***

            for(int i=0;i<len;i++){

                int val = q.peek();
                q.poll();

                for(int j=0;j<3;j++){
                    int nextVal = val+dir[j];
                    if(nextVal == e){
                        return L+1;
                    }
                    if(nextVal>=1 && nextVal<=10000 && check[nextVal] != true){
                        check[nextVal] = true;
                        q.offer(nextVal);
                    }
                }


            }
            L++; // ***

        }

        return 0;
    }

    public static void main(String[] args){


        Main7and8and2 T = new Main7and8and2();
        Scanner I = new Scanner(System.in);

        int s = I.nextInt();
        int e = I.nextInt();

        System.out.print(T.BFS(s, e));

    }
}