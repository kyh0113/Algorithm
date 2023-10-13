import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String S = bufferedReader.readLine();

        int n =0;
        int sum =0;
        for(int i =0; i<S.length(); i++){
            n = dialTime(S.charAt(i));
            sum+=n;
        }
        System.out.println(sum);
    }


    public static int dialTime(char ch){
        if(ch=='A'|| ch=='B' || ch=='C'){
            return 3;
        } else if (ch=='D' || ch=='E' || ch=='F') {
            return 4;
        } else if (ch=='G' || ch=='H' || ch=='I') {
            return 5;
        } else if (ch=='J' || ch=='K' || ch=='L') {
            return 6;
        } else if (ch=='M' || ch=='N' || ch=='O') {
            return 7;
        } else if (ch=='P' || ch=='Q' || ch=='R' || ch=='S') {
            return 8;
        } else if (ch=='T' || ch=='U' || ch=='V') {
            return 9;
        } else if (ch=='W' || ch=='X' || ch=='Y' || ch=='Z') {
            return 10;
        }
        return 0;
    }
}