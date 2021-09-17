import java.util.Scanner;

class Main2and7{
    public int solution(int n, int[] arr){
        int sum=0, cnt=0;

        for(int i=0;i<n;i++){
            if(arr[i]==0)
                cnt =0;
            else{
                cnt++;
                sum += cnt;
            }

        }


        return sum;
    }


    public static void main(String args[]){
        Main2and7 T = new Main2and7();
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = S.nextInt();
        }

        System.out.print(T.solution(n,arr));
        
    }
}
