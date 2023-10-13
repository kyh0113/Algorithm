import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        char arr [] = new char[N];
        String s = bufferedReader.readLine();
        for(int i =0; i<N; i++){
            arr[i] = s.charAt(i);
        }
        int sum = 0;
        int arr2[] = new int[N];
        for(int i =0; i<N; i++){
            arr2[i] = (int)arr[i]-48;
            sum +=arr2[i];
        }
        System.out.println(sum);
    }
}

