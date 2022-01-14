import java.sql.SQLOutput;
import java.util.*;

public class ts35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i=0; i<array.length; i++) {
            array[i] = i+1;
            System.out.print(array[i]);
        }
    }
}
