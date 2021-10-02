class Solution5 {
    public String solution(String s) {
        String answer = "";
        
        int n = s.length();
        if(n%2 ==0)
            answer = s.substring(n/2-1,n/2+1);
        else
            answer = s.substring(n/2,n/2+1);
        
        return answer;
    }
    
    public static void main(String[] args){
        Solution5 t = new Solution5();
        System.out.print(t.solution("LUCKY"));
    }
}

