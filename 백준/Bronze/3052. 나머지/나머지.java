import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int arr[] = new int[10];
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i= 0; i<10; i++){
            arr[i] = Integer.parseInt(bufferedReader.readLine());
            set.add(arr[i]%42);
        }
//        System.out.println(set.size());
        bufferedWriter.write(set.size()+"\n");
//        bufferedWriter.write(set.toString()+"\n");
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}