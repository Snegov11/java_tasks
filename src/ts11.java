import java.util.Scanner;

public class ts11 {
    public static void main(String[] args) {
        Scanner sct = new Scanner(System.in);
        long num = sct.nextLong();
        long n;
        do {
            n = num%10;
            System.out.print(n);
            num = num/10;
        } while (num>0);
    }
}
