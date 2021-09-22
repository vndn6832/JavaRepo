import java.util.*;
class Main6and10{

    public int cal(int dis, int[] arr){
        int cnt = 1, sum =0;

        int start = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-start>=dis){
                cnt++;
                start = arr[i];
            }
        }
        //System.out.println("cnt: "+ cnt);

        return cnt;
    }

    public int solution(int n, int c, int[] arr){
        int ans = 0;

        Arrays.sort(arr);

        int lt = 1;
        int rt = arr[n-1];

        while(lt<=rt){
            int mid = (lt+rt)/2;
            //System.out.println(mid);
            if(cal(mid,arr)>=c){
                lt = mid+1;
                ans = mid;
            }else{
                rt = mid-1;
            }

        }

        return ans;
    }



    public static void main(String[] args){
        Main6and10 T = new Main6and10();
        Scanner S = new Scanner(System.in);

        int n = S.nextInt();
        int c = S.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++)
            arr[i] = S.nextInt();

        System.out.print(T.solution(n, c, arr));
    }
}