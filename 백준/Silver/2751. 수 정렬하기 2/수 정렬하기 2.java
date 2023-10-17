import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bufferedReader.readLine());
        ArrayList<Integer> list=new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();

        for(int i=0;i<n;i++){
            list.add(Integer.parseInt(bufferedReader.readLine()));
        }
        Collections.sort(list);

        for(int i =0; i< list.size(); i++){
            stringBuilder.append(list.get(i)).append("\n");
        }
        System.out.println(stringBuilder);
    }
}
