import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();


        // 3개가 같을 경우
        if (a == b && b == c) {
            System.out.println(10000 + (a * 1000));
        }

        // 2개가 같을 경우
        if (a == b && a != c && b != c) {
            System.out.println(1000 + (a * 100));
        } else if (b == c && a != c && a != b) {
            System.out.println(1000 + (b * 100));
        } else if (a == c && a != b && b != c) {
            System.out.println(1000 + (c * 100));
        }

        // 3개가 다 다를 경우
        if (a != b && b != c && a != c) {
            if (a > b && a > c) {
                System.out.println(a * 100);
            } else if (b > a && b > c) {
                System.out.println(b * 100);
            } else if (c > a && c > b) {
                System.out.println(c * 100);
            }
        }
    }
}
