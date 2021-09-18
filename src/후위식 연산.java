import java.util.*;
class Main5and4{

    public int cal(int a, int b, char m){
        //System.out.println(a + " " + m + " " + b);
        if(m=='+')
            return a+b;
        else if(m=='-')
            return a-b;
        else if(m=='*')
            return a*b;
        else 
            return a/b;
    }
    public int solution(String str){
        int res;
        Stack<Integer> stk = new Stack<>();
  
        int a=0,b=0;
        for(char ch: str.toCharArray()){

            if(ch>='0' && ch<='9')
                stk.push(ch - '0');
            else{
              
                b = stk.pop();
                a = stk.pop();
                stk.push(cal(a,b,ch));
                
            }
            
        }
        res = stk.pop();

        return res;
    }

    public static void main(String[] args){
        Main5and4 T = new Main5and4();
        Scanner S = new Scanner(System.in);

        String str = S.next();

        System.out.print(T.solution(str));
    }
}
