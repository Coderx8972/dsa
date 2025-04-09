
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();

        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                System.out.println("YES");
                System.out.println((i + 1) + " " + (i + 2));
                return;
            }
        }

        System.out.println("NO");
    }
}