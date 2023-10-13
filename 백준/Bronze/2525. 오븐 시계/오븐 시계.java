import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int a = scanner.nextInt();

        int x = m+a;

        if(x>=60){
            h = h + x/60;
            x = x%60;
            if(h>23){
                h = h - 24;
            }
        }
        System.out.println(h+" "+x);
    }
}