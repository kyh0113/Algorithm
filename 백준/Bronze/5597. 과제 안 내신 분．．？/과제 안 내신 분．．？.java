import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean check[] = new boolean[30];
        for(int i =0; i<28; i++){
            int index = Integer.parseInt(bufferedReader.readLine())-1;
            check[index] = true;
        }

        for(int i =0; i<30; i++){
            if(!check[i]){
                bufferedWriter.write(i+1+"\n");
                //System.out.println(i+1);
            }
        }
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}