import java.util.Scanner;
import java.util.Stack;

class BJ17298 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        Stack<Integer> stk = new Stack<>();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            while (!stk.empty() && arr[i] > arr[stk.peek()]) {
                ans[stk.pop()] = arr[i];

            }

            stk.add(i);
        }

        while (!stk.isEmpty()) {
            ans[stk.pop()] = -1;
        }

        // 그냥 출력시 시간 초과
        StringBuilder sb = new StringBuilder();
        for (int x : ans) {
            sb.append(x).append(" ");
        }
        System.out.print(sb);

    }
}