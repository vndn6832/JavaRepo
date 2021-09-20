import java.util.*;
class Main1and10{

    public int[] solution(String st, char ch){
        int[] ans = new int[st.length()];
        int left=100;
        for(int i=0;i<st.length();i++){
            if(st.charAt(i) == ch)
                left = 0;
            else{
                left++;
                
            }
            ans[i] = left;

        }

        int right=100;
        for(int i=st.length()-1;i>=0;i--){
            if(st.charAt(i) == ch)
                right = 0;
            else{
                right++;
            }

            //if(right<ans[i])
                //ans[i] = right;

            ans[i] = Math.min(right,ans[i]);

        }

        return ans;
    }

    public static void main(String[] args){
        Main1and10 T = new Main1and10();
        Scanner S = new Scanner(System.in);

        String st = S.next();
        char ch = S.next().charAt(0);

        for(int i: T.solution(st, ch))
            System.out.print(i+ " ");
    }
}