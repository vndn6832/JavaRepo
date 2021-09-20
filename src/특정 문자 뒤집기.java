import java.util.*;

class Main1and5{

    public String solution(String st){
        String ans="";

        int left =0;
        int right = st.length()-1;
        char[] s = st.toCharArray();

        while(left<right){

            if( !Character.isAlphabetic(s[left])){
                left++;
            }else if(!Character.isAlphabetic(s[right])){
                right--;
            }else{
                char tmp = s[left];
                s[left] = s[right];
                s[right] = tmp;
                left++;
                right--;
            }
            
        }

        ans = String.valueOf(s);
        
        return ans;
    }

    public static void main(String[] args){
        Main1and5 T = new Main1and5();
        Scanner S = new Scanner(System.in);

        String st =  S.next();

        System.out.print(T.solution(st));
    }
}