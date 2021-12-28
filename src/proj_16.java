import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.sql.SQLOutput;
import java.util.Scanner;

public class proj_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        if (x1%2==0 & x2%2==0 & x3%2==0) {
            System.out.println(Math.max(Math.max(x1,x2),x3));
        }
        if (x1%2!=0 & x2%2!=0 & x3%2!=0) {
            System.out.println("Чётных чисел нет");
        }
        if (x1%2==0 & x2%2==0 & x3%2!=0){
            System.out.println(Math.max(x1,x2));
        }
        if (x1%2==0 & x2%2!=0 & x3%2==0){
            System.out.println(Math.max(x1,x3));
        }
        if (x1%2!=0 & x2%2==0 & x3%2==0){
            System.out.println(Math.max(x2,x3));
        }
        if (x1%2!=0 & x2%2!=0 & x3%2==0){
            System.out.println(x3);
        }
        if (x1%2!=0 & x2%2==0 & x3%2!=0){
            System.out.println(x2);
        }
        if (x1%2==0 & x2%2!=0 & x3%2!=0){
            System.out.println(x1);
        }
        }

}
