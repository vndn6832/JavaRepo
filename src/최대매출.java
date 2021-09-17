import java.util.*;
class Main3and3{

    public int solution(int n,int k, int[] arr){
        int max = 0;
        int sum = 0;
        for(int i=0;i<k;i++)
            sum+=arr[i];

        for(int i=k;i<n;i++){
            sum = sum+arr[i] - arr[i-k];
            //System.out.println(i + " " + (i-k) + " " + sum);
            if(sum>max)
                max = sum;
        }

        return max;
    }

    public static void main(String[] args){
        Main3and3 M = new Main3and3();
        Scanner S = new Scanner(System.in);

        int n = S.nextInt();
        int k = S.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = S.nextInt();
        }

        System.out.print(M.solution(n, k, arr));

        S.close();

    }
}