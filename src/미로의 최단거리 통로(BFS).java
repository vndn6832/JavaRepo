import java.util.*;
class info5{
    int x;
    int y;
    info5(int x, int y){
        this.x = x;
        this.y = y;
    }
}
class Main8and11{
    static int[][] arr = new int[7][7];
    int[] dx = {-1,0,1,0};
    int[] dy = {0,-1,0,1};
    boolean[][] check = new boolean[7][7];

    public void BFS(){

        Queue<info5> q = new LinkedList<>();
        q.offer(new info5(0,0));

        check[0][0] = true;

        while(!q.isEmpty()){
            info5 i = q.poll();

            int x= i.x;
            int y = i.y;

            for(int d=0;d<4;d++){
                int nx = x+dx[d];
                int ny = y+dy[d];

                if(nx < 0 || nx>=7 || ny<0 || ny>=7) continue;

                if(check[nx][ny] != true && arr[nx][ny] ==0){
                    check[nx][ny] = true;
                    arr[nx][ny] = arr[x][y] +1;
                    if(nx==6 && ny==6) return;
                    q.offer(new info5(nx,ny));
                }

            }
        }

    }



    public static void main(String[] args){
        Main8and11 t = new Main8and11();
        Scanner s = new Scanner(System.in);


        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                arr[i][j] = s.nextInt();
            }
        }

        t.BFS();

        if(arr[6][6] == 0) 
            System.out.print(-1);
        else
            System.out.print(arr[6][6]);
    }
}