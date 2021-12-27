import java.util.Scanner;

public class ts16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int step = 2;
        while (sc.hasNext()) {
            int r = sc.nextInt();
            for (int i=2; i<6; i++) {
                int result = (int) Math.pow(r,step);
                if (i==5) {
                    System.out.println(result);
                } else {
                    System.out.print(result+" ");
                }
                step++;
            }
            step = 2;
        }

    }
}
