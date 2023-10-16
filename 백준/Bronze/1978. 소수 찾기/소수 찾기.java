import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine()); // 입력 단어 개수

        // 소수 = 1과 자기자신으로만 나누어 떨어지는 수
        int count = 0;
        StringTokenizer stringTokenizer;
        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(stringTokenizer.nextToken());
            if (sosu(a) == true) {
                count++;
            }
        }
        System.out.println(count);
    }
        public static boolean sosu(int a){ // 1 3 5 7
        if(a==1){
            return false;
        }
        for(int i=2; i<a; i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
}
