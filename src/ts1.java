import java.util.Scanner;

public class ts1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] array = new int[num];
        if (num>0) {
            for (int i = 0; i<num; i++){
                array[i] = input.nextInt();
            }
        }
        if (num%2==0){
            for (int i=0; i<array.length; i++){
                System.out.println(array[i]);
            }
        } else {
            for (int i=num-1; i>=0; i--){
                System.out.println(array[i]);
            }
        }
    }
}
