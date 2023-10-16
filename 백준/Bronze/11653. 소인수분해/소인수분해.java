import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int d = 2;
        while(N>1){
            if(N%d==0){
                System.out.println(d);
                N=N/d;
            }else{
                d++;
            }
        }
    }
}