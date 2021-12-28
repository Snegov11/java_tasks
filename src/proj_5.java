import java.util.Scanner;

public class proj_5
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("Сложение: "+x+" + "+y+" = "+(x+y));
        System.out.println("Вычитание: "+x+" - "+y+" = "+(x-y));
    }
}
