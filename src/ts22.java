import java.util.*;

public class ts22{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        boolean isComposite = false;
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                isComposite = true;
                break;
            }
        }
        if (n == 1 || n == 0){
            System.out.println("false");
        }
        else {
            if (isComposite) {
                System.out.println("false");
            } else {
                System.out.println("true");
            }
        }
    }
}
