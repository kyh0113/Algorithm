import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());
        for(int i =0; i<T; i++){
            String s = bufferedReader.readLine();
            if(s.length()==1){
                System.out.println(String.valueOf(s.charAt(0)).repeat(2));
            }else{
                System.out.print(s.charAt(0));
                System.out.println(s.charAt(s.length()-1));
            }
        }
    }
}