import java.util.*;
class Main5and7{
    public String solution(String need, String plan ){

        String ans = "YES";
        Queue<Character> q = new LinkedList<>();
        /*
        for(int i=0;i<st1.length();i++)
            q.offer(st1.charAt(i));
        
        for(int i=0;i<st2.length();i++){
            if(q.contains(st2.charAt(i))){
                if(q.peek() == st2.charAt(i)){
                    q.poll();
                }else{
                    return "NO";
                }
            }
        }*/

        for(char x : need.toCharArray()) q.offer(x);
		for(char x : plan.toCharArray()){
			if(q.contains(x)){
				if(x!=q.poll()) return "NO";
			}
		}

        if(!q.isEmpty())
            return "NO";

        return ans;
    }

    public static void main(String[] args){
        Main5and7 T = new Main5and7();
        Scanner S = new Scanner(System.in);

        String st1 = S.next();
        String st2 = S.next();

        System.out.print(T.solution(st1, st2));
    }
}