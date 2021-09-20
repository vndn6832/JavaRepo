import java.util.*;
class Main1and7{

    public String solution(String st){
        String ans = "YES";

        st = st.toUpperCase();

        for(int i=0;i<st.length()/2;i++){
            if(st.charAt(i) != st.charAt(st.length()-i-1))
                return "NO";
        }

        return ans;
    }

    public static void main(String[] args){
        Main1and7 T = new Main1and7();
        Scanner S = new Scanner(System.in);

        String st = S.next();

        System.out.print(T.solution(st));

    }
}