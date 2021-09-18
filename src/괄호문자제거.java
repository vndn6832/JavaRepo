import java.util.*;
class Main5and2{

    public String solution(String str){
        String ans = "";
        Stack<Character> stk = new Stack<>();

        for(char ch: str.toCharArray()){
            if(ch != ')')
                stk.push(ch);
            else{
                while(stk.pop() != '(');
            }
                
        }

        for(int i=0;i<stk.size();i++)
            ans += stk.get(i);

        return ans;
    }

    public static void main(String[] args){
        Main5and2 T = new Main5and2();
        Scanner S = new Scanner(System.in);

        String str = S.next();

        System.out.println(T.solution(str) );

        S.close();
    }
    
}
