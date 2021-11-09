class Solution6 {
    public int solution(String s) {
        
        String[] words = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven","eight","nine"};
        
        for(int i=0;i<10;i++){
            s = s.replaceAll(words[i],String.valueOf(i));
        }
        
        return Integer.parseInt(s);
    }


    public static void main(String[] args){
        Solution6 t = new Solution6();

        String st = "2three45sixseven";

        System.out.println(t.solution(st));
        
    }
}