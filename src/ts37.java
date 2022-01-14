import java.util.*;

public class ts37 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[] array = new int[n];

        for (int i=0; i<n; i++) {
            int nArray = scr.nextInt();
            array[i] = nArray;
        }

        int index = scr.nextInt();

        System.out.println(array[index]);
    }
}
