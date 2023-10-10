import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");
        int A = Integer.parseInt(stringTokenizer.nextToken()); // 5
        int B = Integer.parseInt(stringTokenizer.nextToken()); // 3

        for(int i =0; i<B; i++){
            System.out.println("*".repeat(A));
        }
    }
}