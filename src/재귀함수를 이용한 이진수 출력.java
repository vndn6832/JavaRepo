import java.util.*;
class Main7and2{

    public String solution(int n){

        String ans="";

        while(n>0){
            ans+=n%2;
            n/=2;
        }

        ans = new StringBuilder(ans).reverse().toString();
        return ans;
    }

    public static void main(String[] args){
        Main7and2 T = new Main7and2();
        Scanner S = new Scanner(System.in);

        int n = S.nextInt();

        System.out.print(T.solution(n));
    }
}