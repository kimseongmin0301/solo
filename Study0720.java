import java.util.Stack;

/**
 * Study0720
 * 프로그래머스
 * 크레인 인형뽑기 게임
 */
public class Study0720 {
    static int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,1},{3,5,1,3,1}};
    static int[] moves = {1,5,3,5,1,2,1,4};
    public static void main(String[] args) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<moves.length; i++){
            int num = moves[i] - 1;
            for(int j=0; j<board.length; j++){
                if(board[j][num] != 0){
                    if(stack.size() != 0 && (int)stack.peek() == board[j][num]){
                        stack.pop();
                        answer += 2;
                    }
                else{
                    stack.push(board[j][num]);
                }
                
                    board[j][num] = 0;
                    break;
                }
            }
        }  
        System.out.print(answer);      
    }
}