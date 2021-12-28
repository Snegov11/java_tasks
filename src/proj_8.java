import java.util.Scanner;

public class proj_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int max_num = Math.max(x,y);
        System.out.println(Math.max(z,max_num));
    }
}
