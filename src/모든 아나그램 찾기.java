import java.util.*;
class Main4and4{

    public int solution(String st1, String st2){
        int ans = 0;
        HashMap<Character,Integer> am = new HashMap<>();
        HashMap<Character,Integer> bm = new HashMap<>();
        
        for(int i=0;i<st2.length()-1;i++){
            am.put(st1.charAt(i),am.getOrDefault(st1.charAt(i), 0)+1);
        }
  
        for(char ch:st2.toCharArray()){
            bm.put(ch,bm.getOrDefault(ch, 0)+1);
        }
        int lt = 0;
        //System.out.println(st2.length());

        for(int rt=st2.length()-1;rt<st1.length();rt++){
            am.put(st1.charAt(rt),am.getOrDefault(st1.charAt(rt), 0)+1);
            //System.out.println(am);
            //System.out.println(bm);
            if(am.equals(bm))
                ans++;
            
            am.put(st1.charAt(lt),am.getOrDefault(st1.charAt(lt), 0)-1);
            if(am.get(st1.charAt(lt))==0)
                am.remove(st1.charAt(lt));

            lt++;
        }

        return ans;
    }
    public static void main(String[] args){
        Main4and4 T = new Main4and4();
        Scanner S = new Scanner(System.in);

        String st1 = S.next();
        String st2 = S.next();

        System.out.print(T.solution(st1, st2));

    }


}