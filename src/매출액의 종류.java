import java.util.*;
class Main4and3 {
    
    public ArrayList<Integer> solution(int n, int k, int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<k;i++)
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);

        ans.add(map.size());

        for(int i=k;i<n;i++){

            int tmp = arr[i-k];
            int tmp2 = arr[i];
            if(map.getOrDefault(tmp, 0)==1)
                map.remove(tmp);
            else
                map.put(tmp,map.get(tmp)-1);

            if(map.getOrDefault(tmp2,0) != 0)
                map.put(tmp2,map.get(tmp2)+1);
            else
                map.put(tmp2,1);

            ans.add(map.size());

        }

        return ans;

    }

    public static void main(String[] args){
        Main4and3 T = new Main4and3();
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
