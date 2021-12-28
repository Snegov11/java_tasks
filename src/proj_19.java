import java.util.Scanner;

class proj_19 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String command = scr.nextLine();
        String str = scr.nextLine();
        if (command.toLowerCase().contains(str.toLowerCase())) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
