import java.util.*;
class Main5and5{
    public int solution(String st){

        int cnt = 0;
        Stack<Character> stk = new Stack<>();
        char tmp = ' ';
        /*
        for(char ch: st.toCharArray()){
            if(ch=='(')
                stk.push(ch);
            else{
                stk.pop();
                if(tmp == ')'){
                    cnt++;
                }
                else{
                    cnt += stk.size();

                }
                
            }

            tmp = ch;
        }
        */

        for(int i=0;i<st.length();i++){
            if(st.charAt(i) == '('){ 
                stk.push('(');
            }
            else{
                stk.pop();
                if(st.charAt(i-1)=='(')
                    cnt+= stk.size();
                else cnt++;
            }
        }

        return cnt;

    }

    public static void main(String[] args){
        Main5and5  T = new Main5and5();
        Scanner S = new Scanner(System.in);

        String st = S.next();

        System.out.print(T.solution(st));
        S.close();
        
        
    }
}