import java.util.Scanner;

public class ts12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letter = sc.nextLine();
        while (sc.hasNext()) {
            String s = sc.next();
            if (s.charAt(0) >= letter.charAt(0) && s.charAt(0) <= letter.charAt(2)) {
                System.out.println(s);
            } else if (s.charAt(0) <= letter.charAt(0) && s.charAt(0) >=letter.charAt(2)) {
                System.out.println(s);
            }
        }
    }
}
