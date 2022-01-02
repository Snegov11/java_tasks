import java.util.Scanner;

public class proj_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println((x == 3 || x == 4 || x == 5) ? "YES" : "NO");
    }
}
