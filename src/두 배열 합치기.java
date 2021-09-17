import java.util.*;
class Main3and1{

    public ArrayList<Integer> solution(int a, int b, int[] m1, int[] m2){
        ArrayList<Integer> ans = new ArrayList<>();
        int p1=0, p2=0;

        while(true){

            if(m1[p1] <= m2[p2]){
                ans.add(m1[p1]);
                p1++;
            }else{
                ans.add(m2[p2]);
                p2++;
            }

            if(p1 == a|| p2 == b) break;


        }

        for(int i=p1;i<a;i++)
            ans.add(m1[i]);

        for(int i=p2;i<b;i++)
            ans.add(m2[i]);

        
        return ans;

    }

    public static void main(String[] args){
        Main3and1 M = new Main3and1();
        Scanner S = new Scanner(System.in);

        int a = S.nextInt();
        int[] m1 = new int[a];
        for(int i=0;i<a;i++)
            m1[i] = S.nextInt();

        int b = S.nextInt();
        int[] m2 = new int[b];
        for(int i=0;i<b;i++)
            m2[i] = S.nextInt();

        
        for(int i: M.solution(a,b,m1,m2))
            System.out.print(i+ " ");

    }
}
