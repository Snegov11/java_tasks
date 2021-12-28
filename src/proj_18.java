import java.util.Scanner;

public class proj_18 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int command = scr.nextInt();
        if (command > 99 & command < 1000)  {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
