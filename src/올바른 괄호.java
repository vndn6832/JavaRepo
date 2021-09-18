import java.util.*;
class Main5and1{
    
    public String solution(String str){
        String ans = "YES";

        Stack<Character> stk = new Stack<>();

        for(char ch: str.toCharArray()){
            if(ch =='(')
                stk.push(ch);
            else{
                if(stk.empty())
                    return "NO";
                stk.pop();
            }
        }

        if(!stk.empty())
            return "NO";

        return ans;
    }



    public static void main(String[] args){
        Main5and1 T = new Main5and1();
        Scanner S = new Scanner(System.in);

        String str = S.next();
        System.out.println(T.solution(str));
    }
}