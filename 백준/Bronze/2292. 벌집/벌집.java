import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int count = 1;
        int sum = 1;
        while(true){
            if(N<=sum){
                break;
            }
            sum+= count*6; // sum = 1,7,19,37~~
            count++;
        }
        System.out.println(count);
    }
}