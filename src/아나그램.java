import java.util.*;
class Main4and2{
    public String solution(String st1, String st2){
        String ans = "YES";
        HashMap<Character,Integer> map = new HashMap<>();
       

        for(char x: st1.toCharArray()){
            map.put(x,map.getOrDefault(x, 0)+1);
        }

        for(char x: st2.toCharArray()){
            if( !map.containsKey(x) || map.get(x) == 0)
                return "NO";
            
            map.put(x,map.get(x)-1);
        }

        return ans;
    }

    public static void main(String[] args){
        Main4and2 T = new Main4and2();
        Scanner S = new Scanner(System.in);

        String st1 = S.next();
        String st2 = S.next();

        System.out.print(T.solution(st1, st2));

    }
