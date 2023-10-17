import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(bufferedReader.readLine());
    int x = 5;
    int y = 3;
    List<Integer> A = new ArrayList<>();

    for(int i =0; i<10000; i++){
        for(int j =0; j<10000; j++){
            if((x*i)+(y*j)==N){
                A.add(i+j);
            }
        }
    }
    int min =10000;
    for(int i =0; i<A.size(); i++){
        if(min>A.get(i)){
            min = A.get(i);
        }
    }
    if(min==10000){
        min = -1;
    }

    System.out.println(min);
    }
}
