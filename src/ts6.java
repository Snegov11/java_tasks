import java.util.Scanner;

public class ts6 {
    public static void main(String[] args) {
        Scanner sct = new Scanner(System.in);
        int scr = sct.nextInt();
        int num=1;
        while (num<=scr) {
            System.out.print(num*num+" ");
            num++;
            if ((num*num)>scr){
                break;
            }
        }
    }
}
