import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer;

        for(int i =1; i<=T; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine()," "); // 문자열로 읽은 토큰을 공백으로 구분
            int A = Integer.parseInt(stringTokenizer.nextToken());
            int B = Integer.parseInt(stringTokenizer.nextToken());
            int sum = A+B;
            bufferedWriter.write("Case #"+i+": "+sum+"\n"); // 줄바꿈 안해주면 한줄로 출력됨

        }
        bufferedWriter.close();
        bufferedReader.close();
    }
}


