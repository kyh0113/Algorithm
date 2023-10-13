import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bufferedReader.readLine());
        int arr[] = new int[N];
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");

        int max = arr[0];
        double sum = 0;

        for(int i =0; i<N; i++){
            arr[i]=Integer.parseInt(stringTokenizer.nextToken());
            if(max<arr[i]){
                max=arr[i];
            }
        }
        for(int i=0; i<N; i++){
            sum+=arr[i];
        }
        System.out.println(sum/max*100/N);
        //System.out.println(sum);

//        bufferedWriter.write((double)sum/N+"\n");
//        bufferedWriter.flush();
//        bufferedWriter.close();
//        bufferedReader.close();
        //System.out.println((double) sum/N);
    }
}