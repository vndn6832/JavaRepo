import java.util.Scanner;

class Main3and5{

    public int solution(int n, int nn, int[] arr){
        int cnt = 0;
        int lt=0, sum=0;

        for(int rt=0;rt<nn;rt++){

            sum += arr[rt];
            if(sum == n)
                cnt++;
            while(sum>=n){
                sum -= arr[lt];
                lt++;
                if(sum==n) cnt++;
            }

        }

        return cnt;
    }
    public static void main(String[] args){

        Main3and5 T = new Main3and5();
        Scanner S = new Scanner(System.in);

        int n = S.nextInt();
        int nn = n/2 +1;
        int arr[] = new int[nn];
        for(int i=0;i<nn;i++){
            arr[i] = i+1;
        }

        System.out.print(T.solution(n, nn, arr));

        S.close();
       
    }
}