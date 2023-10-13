import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer; // 문자열 구분

        int T = Integer.parseInt(bufferedReader.readLine()); // integer형으로 바꿈

        for (int i = 1; i <= T; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine() +" "); // 공백으로 문자열 구분
            int A = Integer.parseInt(stringTokenizer.nextToken());
            int B = Integer.parseInt(stringTokenizer.nextToken());
            bufferedWriter.write(A+B+"\n"); // 줄바꿈 안해주면 한줄로 출력됨
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
