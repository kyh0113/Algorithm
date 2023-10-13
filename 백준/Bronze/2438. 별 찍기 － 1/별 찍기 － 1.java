import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(bufferedReader.readLine());

        for(int i=1; i<=T; i++){
            for(int j = 1; j<=i; j++){
                bufferedWriter.write('*');
            }
            bufferedWriter.write("\n");
        }

        bufferedWriter.close();
        bufferedReader.close();

    }
}
