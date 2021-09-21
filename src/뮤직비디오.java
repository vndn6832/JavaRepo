import java.util.*;
class Main6and9{

    public int count(int[] arr, int capacity){ //dvd 몇장이 필요한지
        int cnt = 1, sum=0;

        for(int x : arr){
            if(sum+x>capacity){
                cnt++;
                sum=x; // sum : 현재 녹음되고 있는 dvd에 노래가 차지하는 용량
            }else{
                sum+=x;
            }
        }

        return cnt;
    }
    
    public int solution(int n, int m, int[] arr){
        int ans = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();
        
        while(lt<=rt){
            int mid = (lt+rt)/2;
            if(count(arr,mid)<=m){
                ans=mid;
                rt=mid-1;
            }else{
                lt=mid+1;
            }
            
        }
        

        return ans;
    }

    public static void main(String[] args){
        Main6and9 T = new Main6and9();
        Scanner S = new Scanner(System.in);

        int n = S.nextInt();
        int m = S.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = S.nextInt();

        
        System.out.print(T.solution(n, m, arr));
    }

    
}