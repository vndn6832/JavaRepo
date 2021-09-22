import java.util.*;
class Main7and2and2{

    public void DFS(int n){
        if(n==0) return;
        else{
            DFS(n/2);
            System.out.print(n%2+" ");
        }
    }


    public static void main(String[] args){
        Main7and2and2 T = new Main7and2and2();
        Scanner S = new Scanner(System.in);

        int n = S.nextInt();

        T.DFS(n);

    }
}