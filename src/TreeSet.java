import java.util.*;
class Main4{

    public int solution(int N,int K, int[] arr){
        int ans = -1;
        TreeSet<Integer> Tree = new TreeSet<>(Collections.reverseOrder()); //내림차순
        for(int i=0;i<N-2;i++){
            for(int j=i+1;j<N-1;j++){
                for(int x=j+1;x<N;x++){
                    int sum = arr[i] + arr[j] + arr[x];
                    Tree.add(sum);
                    
                }
            }
        }

        int cnt = 0;
        //Tree.remove(143); //143 지우기
        //System.out.println(Tree.size()); //원소의 개수
        System.out.println("First: " + Tree.first()); //오름차순이면 최소값, 내림차순이면 최대값
        System.out.println("Last: " + Tree.last()); //오름차순이면 최대값, 내림차순이면 최소값
        for(int i:Tree){
            cnt++;
            System.out.println(i);
            if(cnt == K)
                return i;
        }


        return ans;
    }


    public static void main(String[] args){
        Main4 T = new Main4();
        Scanner S = new Scanner(System.in);

        int N = S.nextInt();
        int K = S.nextInt();

        int[] arr = new int[N];
        for(int i=0;i<N;i++)
            arr[i] = S.nextInt();

        System.out.print(T.solution(N, K, arr));


    }
}