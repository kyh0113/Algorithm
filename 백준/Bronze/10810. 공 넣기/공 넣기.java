import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        int arr[] = new int[N+1]; // 0,1,2,3,4,5
        for(int a =0; a<M; a++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");
            int i= Integer.parseInt(stringTokenizer.nextToken());
            int j= Integer.parseInt(stringTokenizer.nextToken());
            int k= Integer.parseInt(stringTokenizer.nextToken());
            for(int b=i; b<=j; b++){
                arr[b]=k;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int i =1; i<N+1; i++){
            stringBuilder.append(arr[i]+" ");
        }
        System.out.print(stringBuilder.toString());
    }
}