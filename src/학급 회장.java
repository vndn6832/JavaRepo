import java.util.*;
class Main4and1{

    public char solution(int n, String s){
        char answer = ' ';
        HashMap<Character,Integer> map = new HashMap<>();
        for(char x:s.toCharArray()){
            map.put(x,map.getOrDefault(x, 0)+1);
        }
        /*
        System.out.println(map.containsKey('F'));
        System.out.println(map.size());
        System.out.println(map.remove('C'));
        System.out.println(map.size());
        */
        int max = Integer.MIN_VALUE;
        for(char key : map.keySet()){
            //System.out.println(key + " "  + map.get(key));
            if(map.get(key) > max){
                max = map.get(key);
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Main4and1 T = new Main4and1();
        Scanner S = new Scanner(System.in);

        int n = S.nextInt();
        String str = S.next();

        System.out.print(T.solution(n, str));

        
    }
}