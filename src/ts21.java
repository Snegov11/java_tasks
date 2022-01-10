import java.util.Scanner;

public class ts21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_1 = sc.nextInt();
        int num_2 = sc.nextInt();
        int count = 0;

        if (num_1<=num_2) {
            while (num_1 <= num_2) {
                if (num_1%2 != 0) {
                    System.out.print(num_1+" ");
                }
                num_1++;
            }
        } else if (num_1>=num_2) {
            while (num_2 <= num_1) {
                if (num_2%2 != 0) {
                    System.out.print(num_2+" ");
                }
                num_2++;
            }
        }
    }
}
