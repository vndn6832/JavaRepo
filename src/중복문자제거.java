import java.util.*;
class Main1and6{

    public String solution(String st){
        String ans="";

        for(int i=0;i<st.length();i++){
            if(st.indexOf(st.charAt(i)) == i){
                ans+=st.charAt(i);
            }
        }

        return ans;
    }

    public static void main(String[] args){
        Main1and6 T = new Main1and6();
        Scanner S = new Scanner(System.in);

        String st = S.next();

        System.out.print(T.solution(st));
    }
}