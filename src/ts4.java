import java.util.Scanner;

public class ts4 {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double d = b*b - 4*a*c;

        double x_1 = (-b+Math.sqrt(d))/(2*a);
        double x_2 = (-b-Math.sqrt(d))/(2*a);
        System.out.println((x_1+x_2) +" "+(x_1*x_2));

    }
}
