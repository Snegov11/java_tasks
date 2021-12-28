import java.util.Scanner;

public class proj_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        if (x>y & x<z) {
            System.out.println(x);
        } else if (x>z & x<y) {
            System.out.println(x);
        }   else if (y>x & y<z) {
            System.out.println(y);
        } else if (y>z & y<x) {
            System.out.println(y);
        } else if (z>x & z<y) {
            System.out.println(z);
        } else if (z>y & z<x) {
            System.out.println(z);
        }
    }
}
