import java.util.*;

class Node{
    int data;
    Node lt, rt;
    Node(int val){
        data = val;
        lt=rt=null;
    }

}

class Main7and10{

    Node root;
    static boolean check[] = new boolean[5]; 

    public int BFS(Node root){

        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        
        int L =0;
        while(!q.isEmpty()){
            int len = q.size();
            for(int i=0;i<len;i++){

                Node cur = q.peek();
                q.poll();

                if(cur.lt == null && cur.rt == null){

                    return L;
                }

                if(check[cur.data] != true){
                    check[cur.data] = true;
                    if(cur.lt != null) q.offer(cur.lt);
                    if(cur.rt != null) q.offer(cur.rt);
                }


            }

            L++;

        }

        return L;


    }

    public static void main(String[] args){
        Main7and10 T = new Main7and10();
        
        T.root = new Node(1);
        T.root.lt = new Node(2);
        T.root.rt = new Node(3);
        T.root.lt.lt = new Node(4);
        T.root.lt.rt = new Node(5);

        System.out.print(T.BFS(T.root));
        

    }
}