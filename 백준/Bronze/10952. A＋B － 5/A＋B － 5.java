import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer;
        while(true){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");
            int A = Integer.parseInt(stringTokenizer.nextToken());
            int B = Integer.parseInt(stringTokenizer.nextToken());
            int sum = A+B;
            
            if(A==0 && B==0){
                break;
            }else{
                bufferedWriter.write(sum+"\n");
            }
        }
        bufferedWriter.close();
        bufferedReader.close();
    }
}