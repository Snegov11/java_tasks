import java.util.Scanner;

public class proj_20 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int command = scr.nextInt();
        int str = scr.nextInt();
        command = Math.abs(command);
        str = Math.abs(str);
        if (command<100 || command>999) {
            System.out.println("error");
        } else {
            int num_1 = command/10;
            int num_2 = num_1%10;
            if (num_2 == str) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }

        }

    }
}
