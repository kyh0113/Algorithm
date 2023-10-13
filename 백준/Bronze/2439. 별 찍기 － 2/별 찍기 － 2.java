import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bufferedReader.readLine());

        for(int i =1; i<=N; i++){ // 1~5

            // 스페이스
            for(int j =1; j<=N-i; j++){ // 처음엔 공백에 4칸될때까지 그다음은 공백에 3칸될때까지~
                bufferedWriter.write(" ");
            }

            // 별
            for(int j =1; j<=i; j++){ // 처음엔 한개 그 다음은 2개 ~~
                bufferedWriter.write("*");
            }
            bufferedWriter.write("\n");
        }

        bufferedWriter.close();
        bufferedReader.close();

    }
}