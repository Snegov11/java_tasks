import java.util.Scanner;

public class proj_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        String y = scanner.nextLine();

        System.out.println((x.contains(y) || x.length() > 20) ? "YES" : "NO");
    }
}
