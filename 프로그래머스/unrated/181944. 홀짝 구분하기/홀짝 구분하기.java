import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(bufferedReader.readLine());
        if(n%2==0){
            System.out.println(n+" is even");
        }else{
            System.out.println(n+" is odd");
        }
    }
//    private static void Solution(String my_string, int k) {
//        String answer = "";
//        for(int i =0; i<k; i++){
//            answer+=my_string;
//        }
//        System.out.println(answer);
//    }
}
