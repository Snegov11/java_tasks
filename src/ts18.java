import java.util.Scanner;

public class ts18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result;
        int count = 0;
        if (n>0) {
            for (int i=1; i<n+1; i++) {
                result = n - (n-i);
                for (int j=0; j<i; j++) {
                    System.out.print(result+" ");
                    count++;
                    if (count==n) break;
                }
                if (count==n) break;
            }
        }
    }
}
