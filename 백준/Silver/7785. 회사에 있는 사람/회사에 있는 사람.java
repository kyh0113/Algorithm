import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        
        // HashSet을 사용하여 현재 회사에 있는 사람들을 추적
        Set<String> employeesInCompany = new HashSet<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            String name = stringTokenizer.nextToken();
            String action = stringTokenizer.nextToken();

            if (action.equals("enter")) {
                employeesInCompany.add(name);
            } else if (action.equals("leave")) {
                employeesInCompany.remove(name);
            }
        }

        // HashSet을 ArrayList로 변환하여 정렬
        List<String> sortedEmployees = new ArrayList<>(employeesInCompany);
        Collections.sort(sortedEmployees, Collections.reverseOrder());

        for (String employee : sortedEmployees) {
            System.out.println(employee);
        }
    }
}