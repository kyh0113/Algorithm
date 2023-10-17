import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        String arr[] = new String[N];

        for(int i =0; i<N; i++){
            arr[i] = bufferedReader.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() - o2.length()==0){ // 길이가 같으면
                    return o1.compareTo(o2); // 사전순
                }
                return o1.length()-o2.length(); // 길이순
            }
        });
        for(int i =0; i<N; i++){
            if(i+1 !=N){
                if(arr[i].equals(arr[i+1])){
                    continue;
                }
            }
            System.out.println(arr[i]);
        }
    }
}