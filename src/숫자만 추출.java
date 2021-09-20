import java.util.*;
class Main1and9{

    public int solution(String st){
        int ans;
        String tmp = "";
        for(char ch:st.toCharArray()){
            if(Character.isDigit(ch)){
                tmp += ch;
            }
        }

        ans = Integer.parseInt(tmp);

        return ans;
    }

    public static void main(String[] args){
        Main1and9 T = new Main1and9();
        Scanner S = new Scanner(System.in);

        String st = S.next();

        System.out.print(T.solution(st));
    }
}