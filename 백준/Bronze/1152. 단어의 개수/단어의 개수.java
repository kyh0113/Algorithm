import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");
        System.out.println(stringTokenizer.countTokens());

//        while (stringTokenizer.hasMoreTokens()){
//            System.out.print(stringTokenizer.nextToken()+" ");
//        }
    }
}