import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();

        // 세 점을 입력받음
        for (int i = 0; i < 3; i++) {
            List<Integer> point = new ArrayList<>();
            point.add(scanner.nextInt());
            point.add(scanner.nextInt());
            l.add(point);
        }

        for (int i = 0; i < 2; i++) {
            if (l.get(0).get(i).equals(l.get(1).get(i))) {
                answer.add(l.get(2).get(i));
            } else if (l.get(0).get(i).equals(l.get(2).get(i))) {
                answer.add(l.get(1).get(i));
            } else if (l.get(1).get(i).equals(l.get(2).get(i))) {
                answer.add(l.get(0).get(i));
            }
        }

        for (Integer value : answer) {
            System.out.print(value + " ");
        }
    }
}