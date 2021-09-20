import java.util.*;
class Main1and1{

    public int solution(String st, char ch){
        int ans =0;
        st = st.toUpperCase();
        ch = Character.toUpperCase(ch);
        for(char tmp: st.toCharArray()){
            if(tmp == ch)
                ans++;

        }
        return ans;
    }
    public static void main(String[] args){
        Main1and1 T = new Main1and1();
        Scanner S = new Scanner(System.in);

        String st = S.next();
        char ch = S.next().charAt(0);


        System.out.print(T.solution(st, ch));



    }
}