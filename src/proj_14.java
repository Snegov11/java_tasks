import java.awt.List;
import java.util.*;

public class proj_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int s = scanner.nextInt();
        int max = Math.max(Math.max(x,y),z);
        int min = Math.min(Math.min(x,y),z);

        if ((max-min) > s){
            System.out.println("Ура, бастуем!");
        } else {
            System.out.println("За работу, Солнце еще высоко");
        }

    }
}
