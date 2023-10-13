import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[][] array = new int[9][9];
        int max = 0;
        int a = 0, b = 0;
        for (int i = 0; i < 9; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");
            for (int j = 0; j < 9; j++) {
                array[i][j] = Integer.parseInt(stringTokenizer.nextToken());
                if (array[i][j] > max) {
                    max = array[i][j];
                    a = i;
                    b = j;
                }
            }
        }
        System.out.println(max);
        System.out.println((a+1) + " " + (b+1));
    }
}
