import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(0); // 스택이 비어있으면 런타임 오류남

        for (int move : moves) {
            int col = move - 1;
            for (int i = 0; i < board.length; i++) {
                if (board[i][col] != 0) {
                    if (stack.peek() == board[i][col]) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(board[i][col]);
                    }
                    board[i][col] = 0;
                    break; // 해당 열에서 인형을 하나만 뽑아야 하므로, 인형을 뽑았으면 반복문을 탈출 안쪽포문 탈출인거임
                }
            }
        }
        return answer;
    }
}