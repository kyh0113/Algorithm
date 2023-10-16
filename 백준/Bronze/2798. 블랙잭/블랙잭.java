import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N,M;
    static int[] arr;
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");
        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());
        arr = new int[N];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");

        for(int i =0; i<N; i++){
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int sum = 0;
        for(int i = 0; i<N; i++){
            for(int j = i+1; j<N; j++){
                for(int k = j+1; k<N; k++){
                    if(arr[i] + arr[j] + arr[k] <=M && sum <= arr[i]+arr[j]+arr[k]){
                        sum = arr[i]+arr[j]+arr[k];
                    }
                }
            }
        }
        System.out.println(sum);
    }
}