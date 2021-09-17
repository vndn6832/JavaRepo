import java.util.*;
class Main2and10{
    int[] dx = {-1,0,1,0};
    int[] dy = {0,-1,0,1};

    public int solution(int n, int[][] arr){
        int cnt =0;



        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                boolean flag = true;
                for(int d=0;d<4;d++){
                    int nx = i+dx[d];
                    int ny = j+dy[d];
                    if( nx>=0 && nx<n && ny >=0 && ny<n  && arr[nx][ny] >= arr[i][j]){
                        flag = false;
                        break;
                    }
                }
                if(flag == true)
                    cnt++;

            }
        }

        return cnt;

    }
    public static void main(String[] args){
        Main2and10 T = new Main2and10();
        Scanner S = new Scanner(System.in);

        int n = S.nextInt();
        int arr[][] = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = S.nextInt();
            }
        }

        System.out.print(T.solution(n, arr));

        S.close();

    }
}
