import java.util.*;

class Node{
    int data;
    Node lt, rt;
    Node(int val){
        data = val;
        lt=rt=null;
    }

}

class Main7and9{

    Node root;

    public int DFS(Node root, int dis){

        if(root.lt == null && root.rt == null){
            return dis;

        }else{
            return Math.min(DFS(root.lt, dis+1), DFS(root.rt, dis+1));
        }


    }

    public static void main(String[] args){
        Main7and9 T = new Main7and9();
        
        T.root = new Node(1);
        T.root.lt = new Node(2);
        T.root.rt = new Node(3);
        T.root.lt.lt = new Node(4);
        T.root.lt.rt = new Node(5);

        System.out.print(T.DFS(T.root, 0));
        

    }
}