import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static boolean arr[]=new boolean[10001];
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int arr[]=new int[5];
        for(int i=0; i<5; i++){
            int a = Integer.parseInt(bufferedReader.readLine());
            arr[i]=a;
        }
        Arrays.sort(arr);
        int sum =0;
        for(int i =0; i<arr.length; i++){
            sum+=arr[i];
        }
        int x = arr.length/2;
        int center = arr[x];
        System.out.println(sum/5);
        System.out.println(center);
    }
}