import java.util.*;
class Main1and4{

    public ArrayList<String> solution(String[] s){
        ArrayList<String> ans = new ArrayList<>();

        for(String tmp: s){
            ans.add(new StringBuilder(tmp).reverse().toString());
        }

        return ans;
    }

    public static void main(String[] args){
        Main1and4 T = new Main1and4();
        Scanner S = new Scanner(System.in);

        int n = S.nextInt();
        String[] s = new String[n];
        for(int i=0;i<n;i++){
            s[i] = S.next();
        }
        
        for(String ans: T.solution(s)){
            System.out.println(ans);
        }
    }
}