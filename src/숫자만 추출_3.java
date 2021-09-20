import java.util.*;
class Main1and9and3{

    public int solution(String st){
        int ans = 0;
       
        for(char ch:st.toCharArray()){
            if(Character.isDigit(ch))
                ans=ans*10+Character.getNumericValue(ch);
        }

        

        return ans;
    }

    public static void main(String[] args){
        Main1and9and3 T = new Main1and9and3();
        Scanner S = new Scanner(System.in);

        String st = S.next();

        System.out.print(T.solution(st));
    }
}