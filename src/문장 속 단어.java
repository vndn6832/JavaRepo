import java.util.*;
class Main1and3{


    public String solution(String st){
        String ans="";
        int maxSize = 0;
        String[] s = st.split(" ");
        for(String tmp:s){
            if(tmp.length() > maxSize){
                maxSize = tmp.length();
                ans = tmp;
            }
        }

        return ans;
    }

    public static void main(String[] args){
        Main1and3 T = new Main1and3();
        Scanner S = new Scanner(System.in);

        String st = S.nextLine();

        System.out.print(T.solution(st));

    }
}