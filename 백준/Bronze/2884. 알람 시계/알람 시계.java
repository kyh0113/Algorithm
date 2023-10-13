import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();

        m = m - 45;

        if (m >= 0) {
            System.out.println(h + " " + m);
        } 
        
        else if (m < 0) {
            m = m + 45 + 15;
            h = h - 1;
            if (h < 0) {
                h = 23;
            }
            System.out.println(h + " " + m);

        }
    }
}