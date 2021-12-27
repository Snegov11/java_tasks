import java.util.Scanner;

public class ts17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n>0) {
            for (int i = 1; i<n+1; i++) {
                for (int j = 1; j<i+1; j++)
                    if (j < i) {
                        System.out.print(j+ " ");
                    } else {
                        System.out.print(j);
                    }
                System.out.println();
            }
        }

    }
}
