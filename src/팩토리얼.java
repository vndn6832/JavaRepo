import java.util.*;
class Main7and3{

    public int DFS(int n){

        if(n==1){
            return 1;
        }else{
            return n*DFS(n-1);
        }
    }
    public static void main(String[] args){
        Main7and3 T = new Main7and3();
        Scanner S = new Scanner(System.in);

        int n = S.nextInt();

        System.out.print(T.DFS(n));
        

        
    }


}