import java.util.*;
class Main6and6{

    public ArrayList<Integer> solution( int n, int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();

        int[] arr2 = arr.clone();
        Arrays.sort(arr2);


        /*
        for(int i:arr)
            System.out.print(i+" ");

        System.out.println();

        for(int i:arr2)
            System.out.print(i+ " ");
        System.out.println();
        */

        for(int i=0;i<n;i++){
            if(arr[i] != arr2[i])
                ans.add(i+1);
        }



        return ans;
    }

     public static void main(String[] args){

        Main6and6 T = new Main6and6();
        Scanner S = new Scanner(System.in);

        int n = S.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++)
            arr[i] = S.nextInt();

        for(int i:T.solution(n, arr))
            System.out.print(i+" ");
        
     }
}