import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer;
        for(int i =1; i<=T; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");
            int A = Integer.parseInt(stringTokenizer.nextToken());
            int B = Integer.parseInt(stringTokenizer.nextToken());
            int sum = A+B;

            bufferedWriter.write("Case #"+i+": "+A+" + "+B+" = "+sum+"\n");
        }
        bufferedWriter.close();
        bufferedReader.close();
    }
}