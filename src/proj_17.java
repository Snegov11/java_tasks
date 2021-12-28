import java.util.Scanner;

public class proj_17 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String command = scr.nextLine();
        switch (command) {
            case "System.out.println()":
                System.out.println("Это команда вывода на печать");
                break;
            case "if":
                System.out.println("Это условный оператор");
                break;
            case "else":
                System.out.println("Это альтернативная конструкция условного оператора ");
                break;
            default:
                System.out.println("Раздел в разработке");
        }
    }
}
