import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        int[] A = new int[N];
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");
        for(int i =0; i<N; i++){
            A[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        List<Integer>list = new ArrayList<>();
        list.add(A[0]); // list의 사이즈는 1

        for(int i =1; i<N; i++){
            if(list.get(list.size()-1)<A[i]){
                list.add(A[i]);
            }else{
                int left = 0;
                int right = list.size()-1;

                while(left<right){
                    int mid = (left+right)/2;

                    if(A[i]<=list.get(mid)){
                        right = mid;
                    }else{
                        left = mid+1;
                    }
                }
                list.set(right, A[i]);
            }
        }
        System.out.println(list.size());
    }
}