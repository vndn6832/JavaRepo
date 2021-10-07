import java.util.*;
import java.util.Stack;
class mountain{

    public static void main(String[] args){

        Scanner t = new Scanner(System.in);

        int n = t.nextInt();
        int[] arr = new int[n];
        int[] ans = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = t.nextInt();
        }

        
        Stack<Integer> stk = new Stack<>();
        stk.push(arr[0]);

        ans[0] = 0;

        for(int i=1;i<n;i++){

            ans[i] = stk.size();

            while( !stk.empty() && arr[i] >= stk.peek()){
                stk.pop();

            }

            stk.add(arr[i]);

        }
        
        for(int i=0;i<n;i++)
            System.out.print(ans[i] + " ");

    }
}