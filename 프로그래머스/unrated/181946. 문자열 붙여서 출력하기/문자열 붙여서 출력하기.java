import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Solution {
    public static void main(String[] args) throws IOException{
        // Scanner sc = new Scanner(System.in);
        // String a = sc.next();
        // String b = sc.next();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");
        String str1 = stringTokenizer.nextToken();
        String str2 = stringTokenizer.nextToken();
        System.out.println(str1+str2);
    }
}