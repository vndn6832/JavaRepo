import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stk = new Stack<>();
        
        for(int i=0;i<moves.length;i++){
            int val = moves[i] -1;
            //System.out.println("move : " + val);
            for(int j=0;j<board.length;j++){
                
                if(board[j][val] != 0){
                
                    //System.out.println(board[val][j]);
                    if(!stk.isEmpty() && stk.peek() == board[j][val]){
                        stk.pop();
                        answer+=2;
                    }else{
                        stk.push(board[j][val]);
                    }
                    
                    board[j][val] = 0;
                    break;
                    
                }
            
            }
        }
        
        return answer;
    }

    public static void main(String[] args){
        Solution t = new Solution();;

        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        System.out.println(t.solution(board, moves));
        
    }
}