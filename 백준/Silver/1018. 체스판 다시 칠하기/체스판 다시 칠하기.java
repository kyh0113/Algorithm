import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int N = Integer.parseInt(stringTokenizer.nextToken()); // 행
        int M = Integer.parseInt(stringTokenizer.nextToken()); // 열

        String board[] = new String[N];

        for(int i =0; i<N; i++){ // 한줄씩 입력받겠음
            board[i]= bufferedReader.readLine();
        }

        // 체스판 자르기
        int sol = Integer.MAX_VALUE;
        for(int i =0; i<=N-8; i++){ // 8열을 보장하며 체스판을 자를 수 있음
            for(int j = 0; j<=M-8; j++){ // 8행을 보장하며 체스판을 자를 수 있음
                int curSol = solved(i,j,board);

                if(sol>curSol){
                    sol=curSol;
                }
            }
        }
        System.out.println(sol);
    }
    public static int solved(int start_row , int start_col, String[] board){
        String orgBoard[] ={"WBWBWBWB", "BWBWBWBW"};
        int whiteSol = 0;

        for(int i =0; i<8; i++){
            int row = start_row + i;
            for(int j =0; j<8; j++){
                int col = start_col + j;

                if(board[row].charAt(col) != orgBoard[row%2].charAt(j)){ // j을 적은 이유는 0~7 인덱스 투어를 위함
                                            // row%2를 하면 나머지가 0또는 1이 반복해서 나오는데 orgBoard[나머지값]으로 비교가 가능
                    whiteSol++;
                }
            }
        }
        return Math.min(whiteSol, 64-whiteSol);
    }
}
