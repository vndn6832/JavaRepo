import java.util.*;
class Main7and4{

    public int DFS(int n){ //n번쨰 항 구해줌
        if(n==1) return 1;
        else if(n==2) return 1;
        else return DFS(n-2) + DFS(n-1);   
    }

    public static void main(String[] args){
        Main7and4 T = new Main7and4();
        Scanner S = new Scanner(System.in);

        int n = S.nextInt();
        
        for(int i=1;i<=n;i++) //DFS가 n번 호출됨
            System.out.print(T.DFS(i)+" ");
    }
}