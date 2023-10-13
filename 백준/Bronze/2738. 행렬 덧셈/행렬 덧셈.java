import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        int arr1[][] = new int[N][M];
        int arr2[][] = new int[N][M];

        for(int i = 0; i<N; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            for(int j =0; j<M; j++){
                arr1[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }

        for(int i = 0; i<N; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            for(int j =0; j<M; j++){
                arr2[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }

        for(int i =0; i<N; i++){
            for(int j =0; j<M; j++){
                System.out.print(arr1[i][j]+arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}