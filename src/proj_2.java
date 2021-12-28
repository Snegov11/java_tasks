import java.util.Scanner;

public class proj_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int user = input.nextInt();
        System.out.print(user+" "+(int)Math.pow(user,2)+" "+(int)Math.pow(user,3));
    }
}
