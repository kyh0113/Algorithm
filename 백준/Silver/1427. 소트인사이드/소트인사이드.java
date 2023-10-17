import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        String s = String.valueOf(N);
        int arr[] =new int[s.length()];
        for(int i =0; i<s.length(); i++){
            arr[i] =Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        Arrays.sort(arr);
        String a="";
        for(int i=arr.length-1; i>=0; i--){
            a+=arr[i];
        }
        System.out.println(Integer.valueOf(a));
    }
}