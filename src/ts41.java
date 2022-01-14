import java.util.*;
import java.util.stream.IntStream;

public class ts41 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            int nArray = scr.nextInt();
            array[i] = nArray;
        }

        int index = scr.nextInt();
        Arrays.sort(array);
        boolean contains = IntStream.of(array).anyMatch(x -> x == array[index]);

        if (!contains) {
            System.out.println("Ошибка ввода");
        } else {
            for (int i : array) {
                if (i == index && Arrays.binarySearch(array, index) > 0) {
                    System.out.println(array[index - 1]);
                    break;
                }
            }

        }
    }
}
