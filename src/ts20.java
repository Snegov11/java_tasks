import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ts20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> max = new ArrayList<Integer>();
        int num = sc.nextInt();
        if (num != 0) {
            while (num/10 != 0) {
                max.add(Math.abs(num%10));
                num /= 10;
            }
            System.out.println(Collections.max(max));
        } else if (num == 0) {
            System.out.println(num);
        }
    }
}
