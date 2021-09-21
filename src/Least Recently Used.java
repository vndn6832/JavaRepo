import java.util.*;
class Main6and4{


    public int[] solution(int c, int n, int[] arr){
        int[] ans = new int[c];

        for(int x: arr){

            int pos = -1; //index 번호, 위치
            for(int i=0;i<c;i++) 
                if(x==ans[i]) //hit
                    pos = i; 
            
            if(pos==-1){ //miss
                for(int i=c-1;i>=1;i--){
                    ans[i] = ans[i-1];
                }
                
                
            }else{ //hit
                for(int i=pos;i>=1;i--){
                    ans[i] = ans[i-1];
                }
                

            }
            ans[0] = x;

        }

        return ans;

    } 
    public static void main(String[] args){
        Main6and4 T = new Main6and4();
        Scanner S = new Scanner(System.in);

        int c = S.nextInt();
        int n = S.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = S.nextInt();
        }

        for(int i: T.solution(c, n, arr)){
            System.out.print(i + " ");
        }

        S.close();


    }
}