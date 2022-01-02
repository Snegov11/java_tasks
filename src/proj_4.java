import java.util.Scanner;

public class proj_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int allSecond = input.nextInt();
        int allMinuts = allSecond/60;
        int hours = allMinuts/60;
        int minut = allMinuts%60;
        int second = allSecond%60;
        System.out.println(String.valueOf(hours/10+""+hours%10)+":"+String.valueOf(minut/10+""+minut%10)+":"+String.valueOf(second/10+""+second%10));
    }
}
