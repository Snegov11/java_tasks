import java.util.Scanner;

public class ts7 {
    public static void main(String[] args) {
        Scanner sct = new Scanner(System.in);
        int scr = 0;
        int sum = 0;
        while ((scr=sct.nextInt())!=0) {
            sum+=scr;
        }
        System.out.println(sum);
    }
}
