import java.util.Scanner;

public class proj_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int b2 = scanner.nextInt();
        if (x1<b1 & x1<b2 & x2<b1 & x2<b2) {
            System.out.println("Пересечений нет");
        }
        if (x1>b1 & x1>b2 & x2>b1 & x2>b2) {
            System.out.println("Пересечений нет");
        }
        if (x1<b1 & x1<b2 & x2>b1 & x2>b2) {
            System.out.println("Пересечений нет");
        }
        if (b1<x1 & b1<x2 & b2>x1 & b2>x2) {
            System.out.println("Пересечений нет");
        }
        if (x1<b1 & x1<b2 & x2>b1 & x2<b2) {
            System.out.println(b1+" "+x2);
        }
        if (x1>b1 & x1<b2 & x2>b1 & x2>b2) {
            System.out.println(x1+" "+b2);
        }
        if (x1<b1 & x1<b2 & x2==b1 & x2<b2) {
            System.out.println(x2);
        }
        if (x1>b1 & x1==b2 & x2>b1 & x2>b2) {
            System.out.println(x1);
        }
        if (x1==b1 & x2==b2) {
            System.out.println(x1+" "+x2);
        }
        if (x1==b1 & x2<b2) {
            System.out.println(x1+" "+b1);
        }
        if (x1<b1 & x2==b2) {
            System.out.println(x1+" "+b2);
        }
        if (x1>b1 & x1>b2 & x2==b2) {
            System.out.println(b1+" "+x2);
        }
        if (x1==b1 & x2>b2) {
            System.out.println(x1+" "+b2);
        }

    }
}
