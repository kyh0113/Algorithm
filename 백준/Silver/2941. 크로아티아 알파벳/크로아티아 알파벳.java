import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String S = bufferedReader.readLine(); // ljes=njak

        String croatia[] ={"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for(int i =0; i< croatia.length; i++){
            S = S.replace(croatia[i],"*");
        }
        System.out.println(S.length());
    }
}