import java.util.Scanner;

public class proj_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        String y = scanner.nextLine();
        if (x.equals(y)) {
            System.out.println("Access is granted");
        } else {
            System.out.println("Access is denied");
        }
    }
}
