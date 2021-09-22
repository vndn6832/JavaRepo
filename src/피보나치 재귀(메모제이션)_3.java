import java.util.*;
class Main7and4and3{
    static int[] fibo;
    public int DFS(int n){ //n번쨰 항 구해줌
        if(fibo[n] >0) return fibo[n]; //*** 메모제이션
        if(n==1) return fibo[n] = 1;
        else if(n==2) return fibo[n] = 1;
        else return fibo[n] = DFS(n-2) + DFS(n-1);   
    }

    public static void main(String[] args){
        Main7and4and3 T = new Main7and4and3();
        Scanner S = new Scanner(System.in);

        int n = S.nextInt();
        fibo = new int[n+1]; //0번 index 필요 없으니깐
        T.DFS(n);
        for(int i=1;i<=n;i++) //DFS가 n번 호출됨
            System.out.print(fibo[i]+" ");
    }
}