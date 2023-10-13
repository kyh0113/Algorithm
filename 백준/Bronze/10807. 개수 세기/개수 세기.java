import java.io.*;
import java.util.*;
public class Main {

    public static void main(String args[]) throws Exception{
        BufferedReader bufferedReader = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter (new OutputStreamWriter(System.out));

        int N =Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");
        int v = Integer.parseInt(bufferedReader.readLine());

        int count = 0;

        for (int i =0; i<N; i++){
            if(Integer.parseInt(stringTokenizer.nextToken())==v){
                count++;
            }
        }
        // System.out.println(count);
        bufferedWriter.write(Integer.toString(count));
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
