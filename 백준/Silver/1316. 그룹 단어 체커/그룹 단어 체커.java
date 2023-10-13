import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine()); // 입력 단어 개수

        int count = 0;
        for (int i = 0; i < N; i++) {
            String word = bufferedReader.readLine();
            if (isGroupWord(word) == true) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isGroupWord(String word) {
        List<String> list = new ArrayList<>();

        for(int i =0; i<word.length(); i++){ // h a p p y 0~4
            String s = word.substring(i, i+1); // 알파벳 하나하나 나눔
            if(!list.contains(s)) {
                list.add(s);
            }else if(word.charAt(i)!=word.charAt(i-1)){
//          }else if(s!=list.get(i-1)){ // happy의 p의 경우 알파벳은 같지만 내용이 다름
                return false;
            }
        }
        return true;
    }
}