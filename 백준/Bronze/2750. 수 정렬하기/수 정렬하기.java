import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static boolean arr[]=new boolean[10001];
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int arr[]=new int[N];
        for(int i=0; i<N; i++){
            int a = Integer.parseInt(bufferedReader.readLine());
            arr[i]=a;
        }
        Arrays.sort(arr);
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
