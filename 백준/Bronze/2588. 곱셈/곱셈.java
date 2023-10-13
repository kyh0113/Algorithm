import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int a = y/100; // 3
        int b = (y%100)/10; // 8
        int c = (y%100)%10; // 5
        

        System.out.println(x*c);
        System.out.println(x*b);
        System.out.println(x*a);
        System.out.println(x*y);

    }
}
