import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();

        int M = Integer.parseInt(bufferedReader.readLine()); // 60
        int N = Integer.parseInt(bufferedReader.readLine()); // 100
        int sum = 0;

            for(int j =M; j<N+1; j++){
                if(sosu(j)==true){
                    list.add(j);
                }
            }

        for(int i =0; i< list.size(); i++){
            sum += list.get(i);
        }

        if(list.isEmpty()){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(list.get(0));
        }
    }

    public static boolean sosu(int x){
        if(x==1){
            return false;
        }
        for(int i = 2; i<=x/2; i++){
            if(x%i==0){
                return false; // 소수 아님
            }
        }
        return true; // 소수임
    }
}


