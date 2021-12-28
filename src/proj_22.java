import java.util.Scanner;
class proj_22{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if ((x < 0 && x <= y && y <= 2 - x * x) || (x >= 0 && y <= 2 - x * x && y >=0)) {
            System.out.println("Yes");}
        else {
            System.out.println("No");}

    }
}