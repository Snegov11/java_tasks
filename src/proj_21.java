import java.util.Scanner;

public class proj_21 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double num_1 = scr.nextDouble();
        double num_2 = scr.nextDouble();
        if (num_1>num_2) {
            System.out.println(">");
        } else if (num_1<num_2) {
            System.out.println("<");
        } else if (num_1 == num_2) {
            System.out.println("=");
        }
    }
}
