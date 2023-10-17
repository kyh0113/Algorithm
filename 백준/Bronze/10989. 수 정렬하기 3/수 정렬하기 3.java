import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{ // 그림그려서 풀어보면 분명 이해 될거임

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int arr[]=new int[10001];
        int N =Integer.parseInt(bufferedReader.readLine());
        for(int i =0; i<N; i++){
            int a =Integer.parseInt(bufferedReader.readLine()); // 5, 2, 3, 1, 4, 2, 3, 5, 1, 7
            arr[a]++;
        }

        for(int i =0; i<10001; i++){
            for(int j =0; j<arr[i]; j++){ // 숫자 i를 j번 출력
                stringBuilder.append(i).append("\n");
            }
        }
        System.out.println(stringBuilder);
    }
}

