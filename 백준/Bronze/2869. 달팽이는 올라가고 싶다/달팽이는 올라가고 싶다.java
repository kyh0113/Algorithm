import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer;
        stringTokenizer = new StringTokenizer(br.readLine()," ");
        int A = Integer.parseInt(stringTokenizer.nextToken()); // 3
        int B = Integer.parseInt(stringTokenizer.nextToken()); // 1
        int V = Integer.parseInt(stringTokenizer.nextToken()); // 7

        int days = (V-B-1)/(A-B) +1; // (7-1-1)/(3-1) +1
        System.out.println(days);

//        int count = 0;
//        int result=0;
//        while(true){
//            result+=A; // result=3, 2+3=5, 4+3=7
//            count++; // count=1, 2, 3
//            if(V<=result){
//                System.out.println(count);
//                break;
//            }
//            result=result-B; //result=2 5-1=4
//        }
    }
}