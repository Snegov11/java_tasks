import java.util.Scanner;

public class proj_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println(((x+y)%2==0 && (x*y)%2!=0) ? true : false);
    }
}
