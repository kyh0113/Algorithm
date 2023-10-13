import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer;
        for(int i =0; i<T; i++){
            stringTokenizer=new StringTokenizer(bufferedReader.readLine()," ");
            int R = Integer.parseInt(stringTokenizer.nextToken());
            String S = stringTokenizer.nextToken();
            for(int j =0; j<S.length(); j++){ // A B C
                for(int k = 0; k<R; k++){ // 0 1 2
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
