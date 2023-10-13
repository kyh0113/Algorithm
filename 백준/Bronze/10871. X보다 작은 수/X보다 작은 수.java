import java.io.*;
import java.util.*;
public class Main {

    public static void main(String args[]) throws Exception{
        BufferedReader bufferedReader = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter (new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int X = Integer.parseInt(stringTokenizer.nextToken());

        int arr[] = new int[N];
        StringTokenizer num = new StringTokenizer(bufferedReader.readLine()," ");
        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(num.nextToken());
            if(arr[i]<X){
                bufferedWriter.write(arr[i]+" ");
            }
        }
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
