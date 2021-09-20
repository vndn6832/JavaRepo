import java.util.*;
class Main1and9and2{

    public int solution(String st){
        int ans = 0;
       
        for(char ch:st.toCharArray()){
            if(ch>=48 && ch<=57) ans = ans*10+(ch-48);
        }

        

        return ans;
    }

    public static void main(String[] args){
        Main1and9and2 T = new Main1and9and2();
        Scanner S = new Scanner(System.in);

        String st = S.next();

        System.out.print(T.solution(st));
    }
}