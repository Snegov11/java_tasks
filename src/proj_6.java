import java.util.Scanner;

public class proj_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        String y = scanner.nextLine();
        if (x.length()>y.length()) {
            System.out.println("Махатма");
        } else {
            System.out.println("Джавахарлал");
        }
    }
}
