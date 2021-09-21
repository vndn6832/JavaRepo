import java.util.*;
class Main6and5and2{

    public char solution(int n, int[] arr){
        char ans = 'U';
        HashMap<Integer,Integer> maps = new HashMap<>();

  
        for(int i=0;i<n;i++){
            if(maps.containsKey(arr[i]))
                return 'D';
            else
                maps.put(arr[i],maps.getOrDefault(arr[i], 0)+1);
  
        }

        return ans;
    }

    public static void main(String[] args){
        Main6and5and2 T = new Main6and5and2();
        Scanner S = new Scanner(System.in);

        int n = S.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++)
            arr[i] = S.nextInt();

        System.out.print(T.solution(n, arr));
    }
}