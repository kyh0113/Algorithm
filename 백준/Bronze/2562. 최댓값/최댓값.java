import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int []arr = new int [9];
        int max = arr[0];
        int index = 0;
        for(int i=0; i<9; i++){
            arr[i]=Integer.parseInt(bufferedReader.readLine());
            if(max<arr[i]){
                max=arr[i];
                index = i+1;
            }
        }
//        System.out.println(max);
//        System.out.println(index);
        bufferedWriter.write(max+"\n"+index);
        bufferedReader.close();
        bufferedWriter.close();
    }
}