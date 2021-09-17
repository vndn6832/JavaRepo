import java.util.ArrayList;
import java.util.Scanner;

class Main2and5{

    public boolean prime(int num){
        if(num==1) return false;
        for(int i=2;i<num;i++){
            if(num%i ==0) return false;
        }

        return true;
    }
    public ArrayList<Integer> solution(int n, int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		for(int i=0; i<n; i++){
			int tmp=arr[i];
			int res=0;
			while(tmp>0){
				int t=tmp%10;
				res=res*10+t;
				tmp=tmp/10;
			}
			if(prime(res)) answer.add(res);
		}
		return answer;

    }

    public static void main(String[] args){

        Main2and5 T = new Main2and5();
        Scanner S = new Scanner(System.in);

        int n = S.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = S.nextInt();
        }

        for(int i: T.solution(n, arr))
            System.out.print(i + " ");


    }

}