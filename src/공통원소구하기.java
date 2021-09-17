import java.util.*;
class Main3and2{

    public ArrayList<Integer> solution(int a, int b, int[] m1, int[] m2){
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(m1);
        Arrays.sort(m2);
        int p1=0, p2=0;

        while(p1<a && p2<b){

            if(m1[p1] == m2[p2]){
                ans.add(m1[p1]);
                p1++;
                p2++;
            }else if(m1[p1] < m2[p2]){
                p1++;
            }else{
                p2++;
            }

            if(p1 == a|| p2 == b) break;


        }


        
        return ans;

    }

    public static void main(String[] args){
        Main3and2 M = new Main3and2();
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

        S.close();

    }
}
