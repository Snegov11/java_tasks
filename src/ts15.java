import java.util.Scanner;

public class ts15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        for (int i=0; i<x; i++) {
            for (int j=0; j<y; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
