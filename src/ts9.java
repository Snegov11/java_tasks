import java.util.Scanner;

public class ts9 {
    public static void main(String[] args) {
        Scanner sct = new Scanner(System.in);
        int num;
        int count = 0;
        int result=0;
        do {
            num = sct.nextInt();
            if (num%11==0) {
                count++;
                if (num%3==0){
                    result+=num;
                }
            }
        } while (num%11==0);
        System.out.println(count);
        System.out.println(result);
    }
}
