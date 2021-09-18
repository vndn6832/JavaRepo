import java.util.*;
class Main4and3and2 {
    
    public ArrayList<Integer> solution(int n, int k, int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<k-1;i++)
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);


        int lt = 0;
        for(int rt=k-1;rt<n;rt++){
            map.put(arr[rt],map.getOrDefault(arr[rt], 0)+1);
            ans.add(map.size());
            
            map.put(arr[lt],map.getOrDefault(arr[lt], 0)-1);
            if(map.get(arr[lt])==0)
                map.remove(arr[lt]);
            
            lt++;


        }

        return ans;

    }

    public static void main(String[] args){
        Main4and3and2 T = new Main4and3and2();
        Scanner S = new Scanner(System.in);

        int n = S.nextInt();
        int k = S.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = S.nextInt();
        }
        for(int i: T.solution(n, k, arr))
            System.out.print(i+" ");

        S.close();
    }
    
}
