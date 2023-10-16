import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int result;
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        for(int i =1; i<N; i++){ // 0~216
            int number = i;
            int sum = 0; // 각 자릿수 합 변수

            while(number!=0){
                sum+=number%10; // 각 자릿수 더하기
                number /= 10;
            }
            if(sum + i ==N){ // sum은 자릿수 더한거고 i는 생성자
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}