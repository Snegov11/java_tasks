import java.util.Scanner;

public class ts10 {
    public static void main(String[] args) {
        Scanner sct = new Scanner(System.in);
        double num;
        double count = 0;
        double sum = 0;
        do {
            num = sct.nextDouble();
            if (num>0 & num<=10) {
                count++;
                sum+=num;
            }
        } while (num>0 & num<=10);
        System.out.println(sum/count);
    }
}
