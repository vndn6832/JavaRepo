import java.util.*;
class Main7and1{
    public void DFS(int num){
        if(num ==0)
            return;
        else{
            DFS(num-1);
            System.out.print(num+" ");
        }
    }

    public static void main(String[] args){
        Main7and1 T = new Main7and1();
        Scanner S = new Scanner(System.in);

        int N = S.nextInt();

        T.DFS(N);
    }
}