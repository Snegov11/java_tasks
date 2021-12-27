import java.util.Scanner;

public class ts13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for (int i=1; i<=num; i++) {
            if (i%2==0 & i%3==0) {
                System.out.print(i+" ");
                count++;
            }
        }
        if (count==0) {
            System.out.print("Таких чисел нет");
        }
    }
}
