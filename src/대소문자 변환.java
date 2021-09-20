import java.util.*;
class Main1and2{

    public String solution(String st){
        String ans = "";

        for(char ch: st.toCharArray()){
            if(ch >='a' && ch<='z')
                ans+=Character.toUpperCase(ch);
            else
                ans += Character.toLowerCase(ch);
        }

        return ans;
    }


    public static void main(String[] args){
        Main1and2 T = new Main1and2();
        Scanner S = new Scanner(System.in);

        String st = S.next();

        System.out.print(T.solution(st));
    }
}