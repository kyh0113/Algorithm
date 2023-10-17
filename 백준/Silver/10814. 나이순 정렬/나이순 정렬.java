import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        String [][]arr = new String[N][2];
        for(int i =0; i<N; i++){
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");
            arr[i][0] = stringTokenizer.nextToken();
            arr[i][1] = stringTokenizer.nextToken();
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);
            }
        });
        for(int i=0; i<N; i++){
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }
}