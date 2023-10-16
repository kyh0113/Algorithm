import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(bufferedReader.readLine()); // 13

        // 열 구하는 법 -1, -2, -3 -~씩 해줘야함
        long count = 1; // 열
        while (true){
            X -= count;  // X=12, 10, 7, 3, -2
            if(X<=0){ // -2<=0
                X+=count; // -2+5=3
                break;
            }
            count++;  // count=2, 3, 4, 5
        }
        // System.out.println("X: "+X); 3 <- 열
        // System.out.println("count: "+count); 5

        if(count % 2 ==0){
            System.out.println(X + "/" +(count -X +1));
        }else{
            System.out.println((count - X +1) +"/" + X);
        }
    }
}