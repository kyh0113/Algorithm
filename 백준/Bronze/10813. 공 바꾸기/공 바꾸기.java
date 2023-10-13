import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        int arr[] = new int[N];
        for(int z=0; z<arr.length; z++){
            arr[z]=z+1;
        } // [1,2,3,4,5]

        for(int k =0; k<M; k++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            int temp =0;
            temp=arr[i-1];
            arr[i-1]=arr[j-1];
            arr[j-1]=temp;
        }
        String answer = "";
        for(int y=0; y<arr.length; y++){
            answer+=arr[y]+" ";
        }
        System.out.println(answer);
    }
}