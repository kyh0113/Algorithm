import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static boolean arr[]=new boolean[10001];
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int k = Integer.parseInt(stringTokenizer.nextToken());
        int arr[]=new int[N];
        StringTokenizer score;
        score = new StringTokenizer(bufferedReader.readLine()," ");
        for(int i =0; i<N; i++){
            int a = Integer.parseInt(score.nextToken());
            arr[i]=a;
        }
        Arrays.sort(arr);
        System.out.println(arr[N-k]);
    }
}