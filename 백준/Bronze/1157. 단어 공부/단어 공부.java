import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();
        String S = s.toUpperCase();

        int max=0;
        char ch = '?';

        int alphabet[] =new int[26]; // 0~25

        for(int i =0; i<S.length(); i++){ // Mississipi
            alphabet[S.charAt(i)-65]++; // a=65 b=66 c=67
        }

        for(int i =0; i<alphabet.length; i++){
            if(alphabet[i]>max){
                max = alphabet[i];
                ch = (char) (i+65);
            } else if (alphabet[i]==max) {
                ch='?';
            }
        }
        System.out.println(ch);
    }
}
