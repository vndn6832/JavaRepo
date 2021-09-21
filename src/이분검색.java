import java.util.*;
class Main6and8{

    public int solution(int n, int m, int[] arr){
        int ans = 0;

        int lt = 0;
        int rt = n-1;
        
        Arrays.sort(arr);

        while(lt<=rt){
            int mid = (lt+rt)/2;
            if(arr[mid]==m){
                ans = mid+1;
                break;
            }else if(arr[mid]>m){
                rt = mid-1;
            }else{
                lt = mid +1;
            }
        }

        return ans;

    }

    public static void main(String[] args){
        Main6and8 T = new Main6and8();
        Scanner S = new Scanner(System.in);

        int n = S.nextInt();
        int m = S.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = S.nextInt();

        System.out.print(T.solution(n, m, arr));
    }

}