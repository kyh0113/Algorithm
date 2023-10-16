import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");
        int x = Integer.parseInt(stringTokenizer.nextToken()); // 6
        int y = Integer.parseInt(stringTokenizer.nextToken()); // 2
        int w = Integer.parseInt(stringTokenizer.nextToken()); // 10
        int h = Integer.parseInt(stringTokenizer.nextToken()); // 3

        int width_min = Math.min(x, w-x);
        int height_min = Math.min(y, h-y);

        int total_min = Math.min(width_min,height_min);
        System.out.println(total_min);
    }
}
