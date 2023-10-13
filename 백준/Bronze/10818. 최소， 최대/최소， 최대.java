import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");

        int [] arr = new int [N];

        for(int i =0; i<N; i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        int max = arr[0];
        int min = arr[0];
        for(int i=0;i<N;i++){
            if(max<arr[i]){
                max=arr[i];
            }else if(min>arr[i]){
                min=arr[i];
            }
        }
        //System.out.println(min+" "+max);
        bufferedWriter.write(min+" "+max);
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
