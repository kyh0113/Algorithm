import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력받은 데이터가 string으로 반환
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        String str;

        while ((str=br.readLine()) != null) {
            st = new StringTokenizer(str," ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            sb.append(A + B + "\n");

        }
        bw.write(sb.toString()); // 이걸 안에다가 써주면 한번 입력하면 값이 계속 출력됨
        bw.flush();
        bw.close();

    }
}