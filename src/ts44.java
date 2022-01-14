import java.util.*;

public class ts44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arrayStr = sc.nextLine().split(" ");

        int l = arrayStr[0].length();
        int num = 1;

        for (int i=1; i<arrayStr.length; i++) {
            if (arrayStr[i].length() < l) {
                l = arrayStr[i].length();
                num = i+1;
            }
        }
        System.out.println(num);
    }
}
