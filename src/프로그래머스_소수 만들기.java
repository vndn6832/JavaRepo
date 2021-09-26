import java.util.*;
class Solution2 {
    static int answer = 0;
    static boolean[] check;
    static int n;
    static int[] nums2;
    
    public boolean cal(int num){
        for(int i=2;i<=Math.sqrt(num);i++)
            if(num%i==0)
                return false;
        
        return true;
    }
    public void DFS(int idx, int cnt){
        if(cnt==3){
            int sum = 0;
            for(int i=0;i<n;i++){
                if(check[i] == true)
                    sum += nums2[i];
            }
            
            if(cal(sum)){
                answer++;
            }
            
        }else{
            for(int i=idx;i<n;i++){
                if(check[i] != true){
                    check[i] = true;
                    DFS(i,cnt+1);
                    check[i] = false;
                }
            }
        }
        
    }
    
    public int solution(int[] nums) {
        
        n = nums.length;
        check = new boolean[n];
        nums2 = nums;
        
        DFS(0,0);

        return answer;
    }

    public static void main(String[] args){
        Solution2 s = new Solution2();
        int[] arr = {1,2,7,6,4};
        System.out.println(s.solution(arr));
    }
}