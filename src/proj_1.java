import java.util.Scanner;

public class proj_1 {
    public static void main(String[] args) {
        //put your code here
        Scanner input = new Scanner(System.in);
        String user = input.nextLine();
        String helper = input.nextLine();
        String massege = input.nextLine();

        System.out.println("Привет, "+ user +", это твой помощник " + helper+"." );
        System.out.println("У тебя "+ massege + " новых писем.");
    }
}

