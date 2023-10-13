import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        String arr[] = new String[s.length()];
        int i = Integer.parseInt(bufferedReader.readLine());
        for(int j =0; j<s.length(); j++){
            arr[j] = String.valueOf(s.charAt(j));
        }
        System.out.println(arr[i-1]);
    }
}