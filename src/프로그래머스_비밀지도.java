class Solution7 {
    public String cal(int num, int n){
        String ans = "";
        
        int cnt = n;
        
        while(cnt > 0){
            
            ans += String.valueOf(num%2);
            
            num /=2;
            
            cnt--;
        }
        
        
        return ans;
        
        
    }
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        
        answer = new String[arr1.length];
        
        for(int i=0;i<arr1.length;i++){
            String tmp = "";
            String num1 = cal(arr1[i], n);
            String num2 = cal(arr2[i], n);
            
            for(int j=n-1;j>=0;j--){
                if(num1.charAt(j) == '1' || num2.charAt(j) == '1')
                    tmp += "#";
                else
                    tmp += " ";
            }
            
            answer[i] = tmp;
            
        }
        
        return answer;
    }

    public static void main(String[]args){
        Solution7 t = new Solution7();

        int n = 5;
        int[] arr1 = new int[]{9, 20, 28, 18, 11};
        int[] arr2 = new int[]{30, 1, 21, 17, 28};

        for(String x: t.solution(n,arr1,arr2)){
            System.out.println(x);
        }
        
    }
}