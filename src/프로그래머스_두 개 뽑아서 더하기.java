import java.util.*;
class Solution4 {
    int[] res = new int[2];
    ArrayList<Integer> Tree = new ArrayList<>();
    boolean[] check = new boolean[201];
    int[] numbers2;
    int n;
    
    public void DFS(int idx, int cnt){
        if(cnt==2){
            if(check[res[0]+res[1]] != true){
                check[res[0]+res[1]] = true;
                Tree.add(res[0]+res[1]);
            }
            
        }else{
            for(int i=idx;i<n;i++){
                res[cnt] = numbers2[i];
                DFS(i+1,cnt+1); //i+1 ***
            }
        }
    }
    
    public int[] solution(int[] numbers) {
        int[] answer = {};
        numbers2 = numbers;
        n = numbers.length;
       
        
        DFS(0,0);
        
        Collections.sort(Tree);
        
        return Tree.stream().mapToInt(i->i.intValue()).toArray();
        
        //return answer;
    }

    public static void main(String[] args){
        Solution4 t = new Solution4();

        int[] arr = {2,1,3,4,1};
       for(int x:t.solution(arr))
            System.out.print(x+" ");
        
    }
}