import java.util.*;

public class ts38 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[] array = new int[n];
        int summ = 0;

        for (int i=0, j=2; i<n; i++, j+=2) {
            if (j<=n) {
                array[i] = j;

                summ+=array[i];
                System.out.print(" "+array[i]);
            }

        }
        System.out.println();
        System.out.println(summ);

    }
}

